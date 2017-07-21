package pkg2.uva.let2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class IntegerInquiry424 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bg = BigInteger.ZERO;

        while (true){
            String num = br.readLine();

            if (num.equals("0")) break;

            BigInteger n = new BigInteger(num);
            bg = bg.add(n);

        }

        System.out.println(bg.toString());
    }
}
