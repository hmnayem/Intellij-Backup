package algorithm.dynamic;

import java.util.Arrays;

public class LongestIncreasingSubsequences {

    public static void main(String...args){

        int arr[] = {10, 2, 67, 35, 3, 4, 34, 41, 60};

        System.out.println(lis(arr, arr.length));

    }

    private static int lis(int arr[], int n){
        int lis[] = new int[n];
        int max = 0;

        Arrays.fill(lis,1);

        for (int i=1; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j]+1;
                }
            }
        }

        for (int i=0; i<n; i++){
            if (lis[i] > max)
                max = lis[i];
        }

        return max;
    }
}
