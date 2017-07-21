package com.linkedlist;


public class ListTestClass {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i=0; i<numbers.length; i++) {
            int temp = (int) (Math.random() * 30 + 1);
            numbers[i] = temp;
        }

        System.out.print("Unsorted Arrays: ");

        for (int x : numbers) {
            System.out.print(String.format("%5d", x));
        }

        bubble(numbers, numbers.length);

        System.out.print("\n\nSorted Arrays: ");

        for (int x : numbers) {
            System.out.print(String.format("%5d", x));
        }
    }

    private static void bubble(int arr[], int size) {

        if (size == 1) {
            return;
        }

        for (int i = 0; i < size-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubble(arr, size - 1);
    }
}
