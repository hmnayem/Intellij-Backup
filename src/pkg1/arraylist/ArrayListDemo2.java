package pkg1.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("HM Nayem");
        list.add("Shegufa Taranjum");
        list.add("Abir Azim Khan");
        list.add("Jubel Ahmed");
        list.add("Joy Roy");
        list.add("Rafika Risha");
        list.add("Ashrafia Esha");

        System.out.println(list);

        list.remove(4);
        list.remove(4);
        list.remove(4);

        System.out.println(list);

        list.add("Ashraful Wridoy");
        list.add(2, "Kazi Rubaiya Nowrin");

        System.out.println("Size of list " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println(list.contains("Rafika Risha"));
        System.out.println(list.contains("Shegufa Taranjum"));

        list.clear();
        System.out.println(list);

    }
}
