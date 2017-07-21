package pkg3.algo;


public class LinkedListClass {

    public static void main(String[] args){
        ListLinked<String> listLinked = new ListLinked<>();

        listLinked.add("Shegufa");
        listLinked.add("Nayem");

        listLinked.add("Taranjum");
        listLinked.add("Mim");

        System.out.println(listLinked);

        listLinked.add("Shohan");
        listLinked.add("Kheya", 2);

        System.out.println(listLinked.size());
        System.out.println(listLinked);
        listLinked.remove(3);

        for (int i=0; i<listLinked.size(); i++){
            System.out.println(listLinked.get(i));
        }


        listLinked.add("Jubel");
        listLinked.add("BK");
        listLinked.add("Muna");

        System.out.println(listLinked);
        listLinked.remove(5);
        System.out.println(listLinked);

    }
}


class ListLinked<E>{

    private static int counter;
    private Node<E> head;

    ListLinked(){}

    public void add(E data){
        if (head  == null){
            head = new Node<>(data);
        }

        Node<E> temp = new Node<>(data);
        Node<E> current = head;

        if (current != null){
            while (current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(temp);
        }
        increamentCounter();
    }

    private static int getCounter(){
        return counter;
    }

    private static void increamentCounter(){
        counter++;
    }
    private static void decreamentCounter(){
        counter--;
    }


    public void add(E data, int index){

        Node<E> temp = new Node<>(data);
        Node<E> current = head;

        if (current != null){
            for (int i=0; i<index && current.getNext() != null; i++){
                current = current.getNext();
            }
        }
        assert current != null;
        temp.setNext(current.getNext());
        current.setNext(temp);

        increamentCounter();
    }

    public E get(int index){
        if (index < 0)
            return null;

        Node<E> current = null;

        if (head != null){
            current = head.getNext();

            for (int i=0; i<index; i++){
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }

            return (E) current.getData();
        }

        return (E) current;
    }

    public boolean remove(int index){
        if (index < 0 || index > size())
            return false;

        Node<E> current = head;

        if (head != null){
            for (int i=0; i<index; i++){
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
            decreamentCounter();

            return true;
        }

        return false;
    }


    public int size(){
        return getCounter();
    }

    public String toString(){
        String output = "";

        if (head != null){
            Node<E> current = head.getNext();

            while (current != null){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext();
            }
        }

        return output;
    }
}


class Node<E>{

    Node next;
    E data;

    public Node(E data){
        next = null;
        this.data = data;
    }

    @SuppressWarnings("unused")
    public Node(E data, Node next){
        this.next = next;
        this.data = data;
    }

    public E getData(){
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(E data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
