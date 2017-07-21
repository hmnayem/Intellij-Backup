package pkg3.algo.mylinkedlist1;

public class MySInglyLinkedListV1<E> {

    private MyListNodeV1<E> head;
    private int size;

    public MySInglyLinkedListV1(){
        head = null;
    }

    public int getSize(){
        return size;
    }

    private void incrementSize(){
        size++;
    }
    private void decrementSize(){
        size--;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void addFirst(E data){
        MyListNodeV1 node = new MyListNodeV1(data);
        node.setNext(head);
        head = node;
        incrementSize();
    }

    public void addLast(E data){
        if (isEmpty())
            addFirst(data);

        else {
            MyListNodeV1 node = new MyListNodeV1(data);
            MyListNodeV1 current = head;

            while (current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(node);
            incrementSize();
        }
    }

    public void addAtIndex(E data, int index){
        if (index == 1)
            addFirst(data);
        if (index == getSize()+1)
            addLast(data);
        if (index>(getSize()+1) || index<1)
            throw new IndexOutOfBoundsException("Invalid Index");

        if (index<getSize() && index>1){
            MyListNodeV1 node = new MyListNodeV1(data);
            MyListNodeV1 current = head;

            while ((index-2)>0){
                current = current.getNext();
                index--;
            }
            node.setNext(current.getNext());
            current.setNext(node);
            incrementSize();
        }
    }

    public E deleteFirst(){
        E temp = head.getData();
        head = head.getNext();
        decrementSize();
        return temp;
    }

    public E deleteLast(){
        E temp;
        if (head.getNext() == null){
            temp = deleteFirst();
        }
        else {
            MyListNodeV1 current = head;
            while (current.getNext().getNext() != null){
                current = current.getNext();
            }
            temp = (E) current.getNext().getData();
            current.setNext(null);
            decrementSize();
        }

        return temp;
    }

    public E deleteAtIndex(int index){
        E temp = null;

        if (index == 1)
            temp = deleteFirst();
        if (index == getSize())
            temp = deleteLast();

        if (index>getSize()+1 || index<1)
            throw new IndexOutOfBoundsException("Invalid Index");

        if (index<getSize() && index>1){
            MyListNodeV1 current = head;

            while (current.getNext().getNext()!= null && (index-2)>0){
                current = current.getNext();
                index--;
            }

            temp = (E) current.getNext().getData();
            current.setNext(current.getNext().getNext());
            decrementSize();
        }
        return temp;
    }

    public E delete(E data){
        int index = search(data);
        E temp = null;
        if (index != -1)
            temp = deleteAtIndex(index);

        return temp;
    }

    public int search(E data){
        MyListNodeV1 current = head;

        int count = 1;
        while (current != null){
            if (current.getData().equals(data)){
                return count;
            }else {
                current = current.getNext();
                count++;
            }
        }
        return -1;
    }

    public E get(int index){
        if (index>getSize() || index<1)
            return null;

        MyListNodeV1 current = head;
        while (index-1 != 0){
            current = current.getNext();
        }

        return (E) current.getData();
    }

    @Override
    public String toString(){
        String res = "*";
        MyListNodeV1<E> current = head;
        if (isEmpty()){
            res = "List is Empty";
        }

        while (current != null){
            res += (" -> " + current.getData());
            current = current.getNext();
        }
        return res;
    }
}
