package pkg1.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLoop {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Ruby");
        list.add("JavaScript");
        list.add("PHP");
        list.add("Go");
        list.add("Scala");

        System.out.println("Using for loop");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing for each loop");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("\nUsing while loop");

        int count = 0;
        while(count < list.size()){
            System.out.println(list.get(count));
            count++;
        }

        System.out.println("\nUsing Iterator");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumerator");

        Enumeration<String> enm = Collections.enumeration(list);

        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }

    }
}
