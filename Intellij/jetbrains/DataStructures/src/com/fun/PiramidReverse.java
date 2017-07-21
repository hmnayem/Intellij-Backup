package com.fun;

import java.util.Scanner;

public class PiramidReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Total Number of Line: ");
        int line = sc.nextInt();
        System.out.println();


        for (int i=line-1; i>=0; i--) {

            for (int j=i; j<line-1; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<(2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
