package pkg1.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSubList {

    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();

        for(int i=0; i<15; i++){
            ls.add((i*2) + 2);
        }

        System.out.println(ls);

        ArrayList<Integer> ls2 = new ArrayList<>(ls.subList(4, 9));
        System.out.println(ls2);

        List<Integer> ls3 = ls.subList(2, 7);
        System.out.println(ls3);

        Iterator<Integer> itr = ls.iterator();
        int sum = 0;

        for(; itr.hasNext();){
            int num = itr.next();
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum is : " + sum);


    }
}
