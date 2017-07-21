package pkg1.testing;

import java.util.Scanner;

public class LoopTesting {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1; i<=x; i++){
            System.out.println("Counting " + i);
        }
    }
}
