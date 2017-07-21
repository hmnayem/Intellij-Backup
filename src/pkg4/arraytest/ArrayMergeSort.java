package pkg4.arraytest;

public class ArrayMergeSort {

    public static void main(String[] args){

        int [] numbers = {45,11,25,32,56,89,5,32,21,90,34,67,92,55};
        int size = numbers.length;

        System.out.println("Non SORTED : ");

        for (int x : numbers)
            System.out.print(String.format("%5d", x));

        mergeSort(numbers, 0, size-1);

        System.out.println((char)27 + "[31m\nSORTED : ");
        for (int x : numbers)
            System.out.print(String.format("%5d", x));

    }


    public static void mergeSort(int arr[], int low, int high){

        if (low<high){
            int mid = (low+high)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);

            merging(arr, low, mid, high);
        }
    }


    public static void merging(int arr[], int low, int mid, int high){

        int i, j, k;
        int n1 = mid-low+1;
        int n2 = high-mid;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for (i=0; i<n1; i++)
            L[i] = arr[low+i];

        for (j=0; j<n2; j++)
            R[j] = arr[mid+j+1];

        i=0; j=0; k=low;

        while (i<n1 && j<n2){

            if (L[i] <= R[j]){
                arr[k++] = L[i++];
            }
            else
                arr[k++] = R[j++];
        }

        while (i<n1)
            arr[k++] = L[i++];

        while (j<n2)
            arr[k++] = R[j++];
    }
}




























