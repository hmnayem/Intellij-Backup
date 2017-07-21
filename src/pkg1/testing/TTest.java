package pkg1.testing;

import java.io.IOException;
import java.util.Scanner;

public class TTest {

    public static void main(String... args) throws InterruptedException, IOException {

        System.out.println(power(2,8));
    }

    private static int printIt(int n){
        System.out.println("Recursive Start " + n);
        if (n==0)
            return 0;
        int x = n+printIt(n-1);
        System.out.println("Recursive End " + x);
        return x;
    }

    private static void print(int n){
        if (n==0)
            System.out.print("");
        else {
            print(n-1);
            System.out.print("*");
        }
    }

    private static int power(int n, int x){
        if (x == 0)
            return 1;

        return n * power(n,x-1);
    }

    private static int gcd(int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a%b);
    }

    private static int lcm(int a, int b){
        int multiple = 0;

        multiple += b;

        if ((multiple%a==0) && (multiple%b==0))
            return multiple;

        return lcm(a, b);
    }

}
