package pkg1.generics;


import java.util.ArrayList;
import java.util.Collections;

public class GenericsUnionIntersection {

    public static <T extends Comparable<T>>ArrayList<T> sortedUnion(ArrayList<T> al, ArrayList<T> al2){

        ArrayList<T> union = new ArrayList<>();
        union.addAll(al);

        for(T key : al2){
            if(!(union.contains(key)))
                union.add(key);
        }

        Collections.sort(union);

        return union;
    }

    public static <T extends Comparable<T>>ArrayList<T> sortedItersection(ArrayList<T> al1, ArrayList<T> al2){

        ArrayList<T> intersection = new ArrayList<>();

        for(T i : al1){
            for(T j : al2){
                if(i.compareTo(j) == 0)
                    intersection.add(i);
            }
        }

        Collections.sort(intersection);

        return intersection;
    }

    public static void main(String[] args){

        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();

        ls1.add(23); ls1.add(34); ls1.add(56); ls1.add(27); ls1.add(9); ls1.add(69);
        ls2.add(56); ls2.add(78); ls2.add(69); ls2.add(29); ls2.add(10); ls2.add(23);

        ArrayList<Integer> union = sortedUnion(ls1,ls2);
        ArrayList<Integer> intersection = sortedItersection(ls1,ls2);

        System.out.println("Set A : " + ls1);
        System.out.println("Set B : " + ls2);
        System.out.println("Union : " + union);
        System.out.println("Intersection : " + intersection);

        System.out.println();

        ArrayList<String> names1 = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();

        names1.add("Shegufa"); names1.add("Taranjum"); names1.add("Kazi"); names1.add("Rubaiya"); names1.add("Nowrin");
        names2.add("Pritha"); names2.add("Roy"); names2.add("Koli"); names2.add("Shegufa"); names2.add("Taranjum");

        ArrayList<String> namesUnion = sortedUnion(names1, names2);
        ArrayList<String> namesIntersection = sortedItersection(names1, names2);

        System.out.println("Set A : " + names1);
        System.out.println("Set B : " + names2);
        System.out.println("Union : " + namesUnion);
        System.out.println("Intersection : " + namesIntersection);


    }
}
