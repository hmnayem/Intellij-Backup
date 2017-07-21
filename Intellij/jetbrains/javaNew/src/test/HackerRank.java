package test;

import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s="";

        while (sc.hasNext()){
            s += sc.nextLine();

            if (sc.nextLine()==null)
                break;
        }

        System.out.println(s);
    }
}
