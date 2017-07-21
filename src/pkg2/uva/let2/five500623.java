package pkg2.uva.let2;

import java.math.BigInteger;
import java.util.Scanner;

public class five500623 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            BigInteger a, r;
            int n = sc.nextInt();

            a = new BigInteger("1");
            r = new BigInteger("1");
            int i = 1;
            while(i <= n){
                r = r.multiply(a);
                a = a.add(new BigInteger("1"));
                i++;
            }
            System.out.println(n + "!");
            System.out.println(r);

        }
    }
}
