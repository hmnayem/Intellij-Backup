package pkg1.recursion;

import java.util.Random;

public class BinarySearchRecursion {

    public static void main(String[] args){

        int [] numbers = new int[25];

        for (int i=0; i<numbers.length; i++){
            int x = (int) (Math.random()*50 +1);
            numbers[i] = x;
        }



        for (int x: numbers)
            System.out.print(x + " ");

        System.out.println();

        System.out.println(binarySearch(numbers, 25, 0, numbers.length-1));

    }

    private static boolean binarySearch(int[] data, int key, int low, int high){
        if (low > high)
            return false;

        int mid = (low+high)/2;

        if (key == data[mid])
            return true;
        else if (key < data[mid])
            return binarySearch(data, key, low, mid-1);
        else
            return binarySearch(data, key, mid+1, high);
    }
}
