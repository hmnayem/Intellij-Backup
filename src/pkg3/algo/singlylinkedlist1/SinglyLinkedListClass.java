package pkg3.algo.singlylinkedlist1;

public class SinglyLinkedListClass {

    private Node head;
    private int size;

    public SinglyLinkedListClass(){
        head = null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }


    public void addFirst(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addLast(int data){
        if (isEmpty())
            head = new Node(data);
        else {
            Node node = new Node(data);
            Node current = head;

            while (current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(node);
            size++;
        }
    }

    public void addAtIndex(int data, int index){
        if (index == 1)
            addFirst(data);

        if (index == (getSize()+1))
            addLast(data);

        if (index>(getSize()+1) || index<1)
            throw new IndexOutOfBoundsException("Invalid Index");

        if (index<getSize() && index>1){
            Node node = new Node(data);
            Node current = head;

            while ((index-2) > 0){
                current = current.getNext();
                index--;
            }

            node.setNext(current.getNext());
            current.setNext(node);
            size++;
        }
    }

    public int deleteFirst(){
        int temp = head.getData();
        head = head.getNext();
        size--;

        return temp;
    }

    public int deleteLast(){
        int temp;
        if (head.getNext() == null){
            temp = head.getData();
            deleteFirst();
        }
        else {
            Node current = head;

            while (current.getNext().getNext() != null){
                current = current.getNext();
            }
            temp = current.getNext().getData();
            current.setNext(null);
        }
        size--;
        return temp;
    }

    public int deleteAtIndex(int index){

        int temp;
        if (index == 1){
            temp = head.getData();
            head = head.getNext();
            size--;
        }
        else {
            Node current = head;
            while ((current.getNext().getNext())!=null && (index-2)>0){
                current = current.getNext();
                index--;
            }

            temp = current.getNext().getData();
            current.setNext(current.getNext().getNext());
            size--;

        }
        return temp;
    }

    public int search(int data){
        Node current = head;
        int count = 1;

        while (current!=null){
            if (current.getData() == data){
                return count;
            }
            else {
                current = current.getNext();
                count++;
            }
        }
        return -1;
    }

    public int elementAtIndex(int index){
        if (index > size || index < 1)
            return -1;
        Node current = head;
        while (index-1 !=0){
            current = current.getNext();
            index--;
        }
        return current.getData();
    }


    public String toString(){
        String result = "*";
        Node current = head;

        if (isEmpty())
            result = "List is Empty";

        while (current != null){
            result += (" -> " + current.getData());
            current = current.getNext();
        }
        return result;
    }
}
