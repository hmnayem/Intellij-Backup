package pkg1.arraylist;


import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of the array list is : " + al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        System.out.println("Size of array list after initialling : " + al.size());

        System.out.println("Contents of array list is : " + al);

        al.remove("C");
        al.remove(4);

        System.out.println("Size of array list after deletation is : " + al.size());

        System.out.println("Contents of array list is : " + al);

    }

}
