package icpcpkg.dynamicprogramming.lis;

import java.util.Arrays;

public class LIS {

    public static void main(String...args){

        int [] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        System.out.println("LIS : "  + lis(arr));

    }

    //mehtod to calculate Longest Increasing Sub Sequences in Bottom Up dynamic programming

    private static int lis(int [] arr){

        //create an array to keep all data with size of n

        int [] keep = new int[arr.length];

        //initial array with the value 1
        //We can manually fill the array.. But I am using Arrays.fill method from Arrays class

        Arrays.fill(keep, 1);

        //main programming logic goes here

        //start loop from 1 to array length

        for (int i=1; i<keep.length; i++){
            //start another loop from 0 to i
            for (int j=0; j<i; j++){
                //check condition
                if (arr[i] > arr[j] && keep[i] < keep[j]+1)
                    keep[i] = keep[j] + 1;
            }
        }

        // find the maximum value from the array named keep

        int max = keep[0];
        for (int i=1; i<keep.length; i++){
            if (keep[i] > max)
                max = keep[i];
        }

        // return max
        return max;
    }
}
