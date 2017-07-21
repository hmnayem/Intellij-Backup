package pkg2.uva.let2;

import java.util.Scanner;

public class LightMoreLight10110 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            long n = sc.nextLong();

            if (n==0) break;

            long x = (long)Math.sqrt(n);

            if(x*x == n)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}
