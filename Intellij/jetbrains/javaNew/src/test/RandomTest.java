package test;

import java.util.LinkedList;

public class RandomTest {

    private static int counter = 2;

    public static void main(String...args){

        for (int i=1; i<=100; i++){
            counter = 2;
            if (isLucky(i)){
                System.out.println(i);
                continue;
            }

        }

    }

    private static boolean isLucky(int n){
        int next = n;

        if (counter>n)
            return true;

        if (n%counter==0)
            return false;

        next -= next/counter;

        counter++;

        return isLucky(next);
    }

}
