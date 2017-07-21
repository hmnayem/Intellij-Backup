package pkg1.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLoop {

    public static void main(String[] args){

        LinkedList<String> langs = new LinkedList<>();

        langs.add("Java");
        langs.add("Java Script");
        langs.add("PHP");
        langs.add("Pascal");
        langs.add("Objective C");

        System.out.println("Using For loop");

        for(int i=0; i<langs.size(); i++){
            System.out.print(langs.get(i) + "   ");
        }

        System.out.println("\nUsing For Each loop");

        for(String x:langs)
            System.out.print(x + "   ");

        System.out.println("\nUsing Iterator");

        Iterator i = langs.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + "   ");
        }
    }
}
