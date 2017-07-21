package pkg1.linkedlist;

import java.util.LinkedList;

public class LinkedListFirst {

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        System.out.println("Linked List Items : " + list);

        list.addFirst("First Item");
        list.add("Last Item");

        System.out.println("Linked List Items after addition : " + list);

        Object firstVar = list.get(0);
        System.out.println("First element is : " + firstVar);

        list.set(0, "Changed First Element");
        Object firstVar2 = list.get(0);
        System.out.println("First element after updated is : " + firstVar2);

        list.removeFirst();
        list.removeLast();

        System.out.println("Linked list after deletion is : " + list);
        list.add(0, "Newly Added Element");
        list.remove(2);

        System.out.println("Final List is : " + list);

    }

}






















