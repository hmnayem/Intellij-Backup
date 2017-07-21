package pkg3.algo.circularlinkedlist;

import pkg1.mylinkedlist.Node;

public class MyCircularList2 {

    protected class CLNodeB{
        private int data;
        private CLNodeB next;

        public CLNodeB(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public CLNodeB getNext() {
            return next;
        }

        public void setNext(CLNodeB next) {
            this.next = next;
        }
    }

    private CLNodeB head;
    private CLNodeB tail;
    private int size;

    public MyCircularList2(){
        head = null;
        tail = null;
    }

    public int getSize(){
        return size;
    }

    private void plus(){
        size++;
    }

    private void minus(){
        size--;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data){
        CLNodeB node = new CLNodeB(data);

        if (isEmpty()){
            head = node;
            tail = node;
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
            CLNodeB node = new CLNodeB(data);
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            plus();
        }
    }

    public void deleteFirst(){
        if (isEmpty()){
            System.out.println("Empty list");
        }
        else {
            head = head.getNext();
            tail.setNext(head);
            minus();
        }
    }

    public void display(){
        CLNodeB node = head;
        if (isEmpty())
            System.out.println("Empty List");
        else {
            System.out.print("*");
            do {
                System.out.print(" -> " + node.getData());
                node = node.getNext();
            }while (node != head);
            System.out.println();
        }
    }
}






















