package pkg2.uva.let2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsCryptanalysis10008 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[95];
        int max=0;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){

            String line = br.readLine().toUpperCase();

            for(char j = 'A'; j <= 'Z'; j++){
                for(int l=0; l<line.length(); l++){
                    if (line.charAt(l) == j)
                        arr[j]++;
                }
                if (arr[j] > max)
                    max = arr[j];
            }

        }

        for(int i=max; i>0; i--){
            for(char j = 'A'; j<='Z'; j++){
                if(arr[j] == i)
                    System.out.println(j + " " +i);
            }
        }

    }
}
