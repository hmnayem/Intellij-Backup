package pkg1.recursion;

public class ArraySum {

    public static void main(String[] args){

        int[] arr = new int[34545];
        arrayFill(arr);

        double start1 = System.currentTimeMillis();
        System.out.println("Sum of array by using linear recursion : " + linearSum(arr, arr.length-1));
        double end1 = System.currentTimeMillis();
        System.out.println("total time elapsed : " + (end1-start1));


        double start2 = System.currentTimeMillis();
        System.out.println("Sum of array by using binary recursion : " + binarySum(arr, 0, arr.length));
        double end2 = System.currentTimeMillis();
        System.out.println("total time elapsed : " + (end2-start2));

    }


    private static int linearSum(int[] arr, int n){
        if (n==0)
            return 0;

        return linearSum(arr, n-1) + arr[n-1];
    }


    private static int binarySum(int[] arr, int low, int high){
        if (low > high)
            return 0;
        else if (low == high)
            return arr[low];
        else {
            int mid = (low+high)/2;
            return binarySum(arr, low, mid) + binarySum(arr, mid+1, high);
        }
    }

    private static void arrayFill(int[] arr){
        for (int i=0; i<arr.length; i++){
            int x = (int)(Math.random()*3456);
            arr[i] = x;
        }
    }
}
