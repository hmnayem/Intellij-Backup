package pkg4.arraytest;

import java.util.Scanner;

public class ArrayInsert {

    public static void main(String[] args){

        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int size = 0;

        while (sc.hasNext()){
            int n = sc.nextInt();

            if (n==0) break;

            arr[size++] = n;
        }

        for (int i=0; i<size; i++)
            System.out.print("\t" + arr[i]);

        System.out.println();


        System.out.println("To insert enter data and then index");
        int data = sc.nextInt();
        int index = sc.nextInt();

        for (int i=size; i>=index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = data;
        size++;

        for (int i=0; i<size; i++)
            System.out.print("\t" + arr[i]);
    }
}
