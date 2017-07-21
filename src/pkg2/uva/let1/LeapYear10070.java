package pkg2.uva.let1;

import java.math.BigInteger;
import java.util.Scanner;
import static java.math.BigInteger.*;
import static java.math.BigInteger.valueOf;

public class LeapYear10070 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger year ;
        int chec =0;

        while(sc.hasNextBigInteger()){

            year = sc.nextBigInteger();

            if(chec !=0)System.out.println();

            chec = 1;

            if((year.mod(valueOf(400)).equals(ZERO))||((year.mod(valueOf(4)).equals(ZERO))&&!(year.mod(valueOf(100)).equals(ZERO)))){

                System.out.println("This is leap year.");

                if(year.mod(valueOf(15)).equals(ZERO))
                    System.out.println("This is huluculu festival year.");

                if(year.mod(valueOf(55)).equals(ZERO))
                    System.out.println("This is bulukulu festival year.");
            }
            else if(year.mod(valueOf(15)).equals(ZERO)){
                System.out.println("This is huluculu festival year.");
            }
            else
                System.out.println("This is an ordinary year.");

        }
    }

}
