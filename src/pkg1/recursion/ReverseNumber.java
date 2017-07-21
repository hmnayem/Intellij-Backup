package pkg1.recursion;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println("Reverse of " + n + " is : " + reverse(n));

        System.out.println("Sum of digits : " + sumOfDigits(n));

    }

    private static long power(long x, long n){
        if(n==0) return 1;

        else if(n%2 == 0){
            long y = power(x, n/2);
            return y*y;
        }

        else return x * power(x, n-1);
    }

    private static long reverse(long n){
        int digit;

        if (n == 0) return 0;

        digit = (int) Math.log10(n);

        return ((n%10)*power(10, digit) + reverse(n/10));
    }

    private static long sumOfDigits(long n){
        if (n==0) return 0;

        return (n%10) + sumOfDigits(n/10);
    }
}
