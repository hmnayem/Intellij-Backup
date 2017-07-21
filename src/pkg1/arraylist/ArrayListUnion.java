package pkg1.arraylist;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListUnion {

    public static void main(String[] args){

        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();

        set1.add(3);
        set1.add(7);
        set1.add(8);
        set1.add(5);

        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(5);

        for(Integer i : set1){
            for (Integer j : set2){
                if(i.compareTo(j) == 0)
                    intersection.add(i);
            }
        }
        Collections.sort(intersection);

        System.out.println(intersection + "    ");

        union.addAll(set1);

        for(Integer key : set2){
            if(!(union.contains(key)))
                union.add(key);
        }

        Collections.sort(union);
        System.out.println(union + "    ");
    }


}
