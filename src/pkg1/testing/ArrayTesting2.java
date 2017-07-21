package pkg1.testing;

import java.util.Scanner;

public class ArrayTesting2 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        int [] numbers = new int[n];

        for(int i=0; i<numbers.length; i++){
            int m = sc.nextInt();
            numbers[i] = m;
            System.out.println(i);
        }

        for(int x:numbers)
            System.out.print(x + "   ");

        System.out.println();
    }
}
