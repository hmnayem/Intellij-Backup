package algorithm.dynamic;

public class LISnlogn {

    public static void main(String...args){

        int [] arr = {2,5,3,7,11,8,10,13,6};
        System.out.println(lcs(arr));

    }

    private static int ceilIndex(int [] arr, int l, int r,  int key){

        while (r-l > 1){
            int m= l+ (r-l)/2;
            if (arr[m] >= key){
                r = m;
            }
            else
                l = m;
        }

        return r;
    }

    private static int lcs(int[]arr){
        int [] tailtable = new int[arr.length];
        int len;

        tailtable[0] = arr[0];
        len = 1;

        for (int i=1; i<arr.length; i++){
            if (arr[i] < tailtable[0])
                tailtable[0] = arr[i];

            else if(arr[i] > tailtable[len-1])
                tailtable[len++] = arr[i];
            else
                tailtable[ceilIndex(tailtable, -1, len-1, arr[i])] = arr[i];
        }

        for (int i=0; i<tailtable.length; i++)
            System.out.print(String.format("%8d", tailtable[i]));

        System.out.println();

        return len;
    }
}








