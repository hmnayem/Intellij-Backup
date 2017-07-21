package pkg1.testing;

import java.util.Scanner;

public class ArrayInputTesting {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        String [] names = new String[n];

        System.out.println("Enter Names");

        for (int i=0; i<names.length; ++i){
            String name = sc.nextLine();
            names[i] = name;
            System.out.println(i);
        }


        System.out.println("\nArray Initialization has finished...\n");
        System.out.println("Size of Array is " + names.length);
        System.out.println("Elements of Array are : ");

        for(String x : names)
            System.out.print(x + "    ");
    }
}
