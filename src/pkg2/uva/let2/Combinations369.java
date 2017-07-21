package pkg2.uva.let2;

import java.math.BigInteger;
import java.util.Scanner;

public class Combinations369 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while (true){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N==0 && M==0) break;


            BigInteger result = (fact(N)).divide(fact(N-M).multiply(fact(M)));

            System.out.println( N + " things taken " + M + " at a time is " + result.toString() + " exactly.");
        }

    }

    private static BigInteger fact(int n){
        BigInteger fact = BigInteger.ONE;

        for(int i=1; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
}
