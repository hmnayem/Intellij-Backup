package pkg2.uva.let2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkewBinary575 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String num = br.readLine();

            if (num.equals("0")) break;

            char[] nums = num.toCharArray();
            int digit = nums.length;
            long decimal = 0;

            for (int i=0; i<nums.length; i++){
                long temp = Character.getNumericValue(nums[i]);
                decimal += (temp * (Math.pow(2,digit) - 1));
                digit--;
            }

            System.out.println(decimal);
        }

    }

}
