package pkg1.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortString {

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

        Iterator<String> listItr = list.iterator();

        System.out.println("Unsorted List");
        System.out.println();

        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println();
        System.out.println();
        System.out.println("Sorted ArrayList");
        System.out.println();

        Collections.sort(list);

        Iterator<String> sItr = list.iterator();

        while (sItr.hasNext()) {
            System.out.println(sItr.next());
        }
    }
}
