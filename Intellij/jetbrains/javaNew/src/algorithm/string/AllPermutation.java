package algorithm.string;

import java.util.Arrays;

public class AllPermutation {

    private static int count = 0;

    public static void main(String[] args){

        String s = "ABC";
        char str[] = s.toCharArray();

        permute(str, 0, str.length-1);

        System.out.println("\n\nThere are total " + count + " permutation possible");
    }

    private static void permute(char[] arr, int left, int right){

        System.out.println("Start calculating " + left);
        if (left == right) {            // Terminating Condition
            System.out.println(arr);    // if starting index and ending index become equal print str
            count++;
        }

        else {
            for (int i=left; i<=right; i++){    // start loop from left to right

                System.out.println("Before First swapping " + Arrays.toString(arr) + " and i is : " + i);
                char temp1 = arr[left];         // swap arr[left] with arr[i]
                arr[left] = arr[i];
                arr[i] = temp1;

                System.out.println("After first swapping " + Arrays.toString(arr));
                permute(arr, left+1, right);    // recursive call with increasing left index by 1

                System.out.println("End Calculating " + left);
                char temp2 = arr[left];         // again swap arr[left] with arr[i]
                arr[left] = arr[i];
                arr[i] = temp2;

                System.out.println("After second swapping " + Arrays.toString(arr) + " left is : " + left);

                System.out.println();
                System.out.println();
            }
        }
    }

}
