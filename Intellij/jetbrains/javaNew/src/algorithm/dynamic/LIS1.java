package algorithm.dynamic;

public class LIS1 {

    public static void main(String[] args){

        int [] arr = {3,5,2,6,23,6,8,78,44,33,55,66,30,88};

        System.out.println("Longest Increasing Subsequence is : " + lis(arr));

    }

    public static int lis(int [] arr){
        int [] lis = new int[arr.length];
        int max = 0;

        for (int i=0; i<lis.length; i++)
            lis[i] = 1;

        for (int i=1; i<arr.length; i++){
            for (int j=0; j<i; j++){
                if (arr[i]>arr[j] && lis[i] < lis[j]+1)
                    lis[i] = lis[j] + 1;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (lis[i] > max)
                max = lis[i];
        }

        return max;
    }
}
