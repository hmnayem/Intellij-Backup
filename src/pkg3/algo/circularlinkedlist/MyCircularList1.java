package pkg3.algo.circularlinkedlist;

public class MyCircularList1 {

    protected class CLNodeA{
        private int data;
        private CLNodeA next;

        public CLNodeA(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public CLNodeA getNext() {
            return next;
        }

        public void setNext(CLNodeA next) {
            this.next = next;
        }
    }

    private CLNodeA head;
    private CLNodeA tail;
    private int size;

    public MyCircularList1(){
        head = null;
        tail = null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void plus(){
        size++;
    }

    public void minus(){
        size--;
    }

    public void addFirst(int data){
        CLNodeA node = new CLNodeA(data);
        if (isEmpty()){
            head = node;
            tail = head;
            node.setNext(head);
        }
        else {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        }
        plus();
    }

    public void addLast(int data){
        if (isEmpty())
            addFirst(data);
        else {
            CLNodeA node = new CLNodeA(data);
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            plus();
        }
    }

    public void addAtIndex(int data, int index){
        if (index == 1)
            addFirst(data);
        if (index == getSize()+1)
            addLast(data);
        if (index>getSize()+1 && index<1)
            System.out.println("Invalid Index");

        if (index<=getSize() && index>1){
            CLNodeA node = new CLNodeA(data);
            CLNodeA current = head;

            while ((index-2)>0){
                current = current.getNext();
                index--;
            }
            node.setNext(current.getNext());
            current.setNext(node);
            plus();
        }
    }

    public  void deleteFirst(){
        if (isEmpty())
            System.out.println("Empty List");
        if (head.getNext() == null){
            head = null;
            tail = null;
        }
        else {
            head = head.getNext();
            tail.setNext(head);
        }
        minus();
    }

    public void deleteLast(){
        if (isEmpty())
            System.out.println("Empty List");
        if (head.getNext() == null)
            deleteFirst();
        else {
            CLNodeA node = head;
            while (node.getNext().getNext() != head){
                node = node.getNext();
            }
            node.setNext(null);
            tail = node;
            tail.setNext(head);
            minus();
        }
    }

    public void display(){
        CLNodeA node = head;
        if (isEmpty()){
            System.out.println("Empty List");
        }
        else {
            do{

                System.out.print(" -> " + node.getData());
                node = node.getNext();

            }while (node!=head);
        }

        System.out.println();
    }
}
