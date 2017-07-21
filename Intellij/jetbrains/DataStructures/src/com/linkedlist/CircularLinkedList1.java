package com.linkedlist;

public class CircularLinkedList1 {

    private class Nodes{
        int data;
        Nodes next;

        Nodes(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Nodes head;
    private Nodes tail;
    private int size;

    public CircularLinkedList1() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(int data) {

        Nodes temp = new Nodes(data);

        if (size == 0) {

            head = temp;
            tail = temp;
            temp.next = head;
        }
        else{

            Nodes current = head;
            temp.next = current;
            head = temp;
            tail.next = head;
        }
        size++;
    }

    public void addLast(int data) {

        if (size == 0) {
            addFirst(data);
        }
        else {
            Nodes temp = new Nodes(data);
            tail.next = temp;
            tail = temp;
            tail.next = head;
            size++;
        }
    }

    public void deleteFirst() {

        if (size == 0) {
            throw new IndexOutOfBoundsException("List Is Empty");
        }
        else{

            head = head.next;
            tail.next = head;
            size--;
        }
    }

    public void deleteLast(){
        if (size == 0) {
            throw new IndexOutOfBoundsException("List Is Empty");
        }
        else {
            Nodes curr = head;
            Nodes temp = head;

            while (curr != tail) {
                temp = curr;
                curr = curr.next;
            }

            tail = temp;
            tail.next = head;

            size--;
        }
    }

    public void printList() {
        Nodes temp = head;

        if (size <= 0) {
            throw new IndexOutOfBoundsException("List Is Empty");
        }
        else {
            System.out.print("*");
            while (true) {
                System.out.print("->" + temp.data);
                temp = temp.next;

                if (temp == head) {
                    break;
                }
            }
            System.out.println();
        }
    }


}














