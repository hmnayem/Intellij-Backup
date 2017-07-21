package pkg4.arraytest;

import java.util.Arrays;

public class LargestTwo {

    public static void main(String[] args){

        int [] a1 = {4,2,6,8,1,7,5};
        int [] b2 = {4,6,8,2,1,9,7,5};
        int result = a1[0];

        for (int i=1; i<a1.length; i++){
            result = result ^ a1[i];
        }

        for (int i=0; i<b2.length; i++){
            result = result ^ b2[i];
        }

        System.out.println(result);
    }
}
