package com.garjs;

import java.util.Arrays;

public class StaticKeywordTest {

    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 2, 8, 9, 20};

        int[] arr2 = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr, arr2)) {
            System.out.println("They Are Equals");

        } else {
            System.out.println("They Are Not Equals");
        }



    }
}
