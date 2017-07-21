package com.fun;

import java.util.Scanner;

public class PiramidNormal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Total Number of Line: ");
        int line = sc.nextInt();
        System.out.println();


        for (int i=0; i<line; i++) {

            for (int j=line; j>i+1; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<(2*i)+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void anotherStaticMethod() {
        System.out.println("We Are Calling static method from another class");
    }
}

