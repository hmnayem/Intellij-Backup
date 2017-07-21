package pkg1.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListMine {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> aList = new ArrayList<>();

        System.out.println("Enter a number of data item");
        int n = sc.nextInt();

        System.out.println("Please enter your names");

        for(int i=0; i<=n; i++){
            String value = sc.nextLine();
            aList.add(value);
        }

        System.out.println("You have entered: ");

        Iterator<String> itr = aList.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + "  ");
        }
        
    }

}


