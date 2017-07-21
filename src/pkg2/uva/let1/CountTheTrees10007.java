package pkg2.uva.let1;

import java.math.BigInteger;
import java.util.Scanner;

public class CountTheTrees10007 {

    public static BigInteger factorial (int n) {
        BigInteger curr = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            curr = curr.multiply(BigInteger.valueOf(i));
        }
        return curr;
    }
    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            if (n==0) break;
            BigInteger answer = factorial(2*n).divide(factorial(n+1));
            System.out.println(answer.toString());
        }
    }
}
