package icpcpkg.dynamicprogramming.lis;

public class LISlogNTime {

    public static void main(String[] args){

        int [] arr = {2,5,3,7,11,8,10,13,6};
        System.out.println(lcs(arr));

    }

    // binary search to search a specific index
    private static int ceilIndex(int[] arr, int l, int r, int k){
        while (r-l>1){
            int m = l + (r-l)/2;

            if (arr[m] >= k)
                r = m;
            else
                l = m;

        }
        return r;
    }
    private static int lcs(int [] arr){

        //define an array with the size of arr.length

        int [] tailTable = new int[arr.length];
        int len;

        tailTable[0] = 0;
        len = 1;

        for (int i=1; i<arr.length; i++){

            if (arr[i] < tailTable[0])
                tailTable[0] = arr[i];

            else if (arr[i] > tailTable[len-1])
                tailTable[len++] = arr[i];

            else
                tailTable[ceilIndex(arr, -1, len-1, arr[i])] = arr[i];
        }
        return len;
    }
}
