package pkg2.uva.let2;

import java.math.BigInteger;
import java.util.Scanner;

public class Product10106 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            String num1 = sc.nextLine();
            String num2 = sc.nextLine();

            BigInteger n1 = new BigInteger(num1);
            BigInteger n2 = new BigInteger(num2);
            BigInteger pro = n1.multiply(n2);

            System.out.println(pro.toString());
        }
    }
}
