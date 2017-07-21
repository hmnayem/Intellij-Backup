package algorithm.numerical;

import java.util.Arrays;

public class PermutationOfANumber {

    public static void main(String...args){

        int number = 101;
        int digit = (int) Math.log10(number) + 1;
        int [] digits = new int[digit];

        digitArray(digits, digit, number);

        permutation(digits, 0, digit-1);

    }

    private static void digitArray(int [] digits, int size, int number){
        if (number==0)
            return;

        digits[size-1] = number%10;
        digitArray(digits, size-1, number/10);
    }

    private static void permutation(int [] arr, int start, int end){

        if (start==end)
            printArray(arr);

        else {

            for (int i=start; i<=end; i++){

                int temp1 = arr[i];
                arr[i] = arr[start];
                arr[start] = temp1;

                permutation(arr, start+1, end);

                int temp2 = arr[i];
                arr[i] = arr[start];
                arr[start] = temp2;
            }
        }
    }

    private static void printArray(int[] arr){
        for (int x : arr)
            System.out.print(x);

        System.out.println();
    }
}
