package uva.adhok;

import java.io.*;
import java.io.IOException;
import java.util.*;
public class Jubel{
    static int j = 0;
    public static void main(String [] args) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++)
        {
            String name = br.readLine();
            int len = factorial(name.length());

            String [] st1 = new String[len];
            char [] arr = name.toCharArray();
            j=0;
            permutation(arr,st1,0,name.length()-1);

            Arrays.sort(st1);
            for(int k=0;k<j;k++)
            {
                System.out.print("\n"+st1[k]);
            }
            System.out.print("\n");
        }
    }
    private static int factorial(int fact)
    {

        if(fact == 1) return 1;
        return fact * factorial(fact-1);
    }
    private static void permutation(char arr[],String [] st1,int left,int right)
    {

        if(left == right)
        {
            String ss = new String(arr);
            st1[j++] = ss;
        }
        else{
            for(int i = left;i<=right;i++)
            {
                char temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                permutation(arr,st1,left +1,right);
                char temp1 = arr[left];
                arr[left] = arr[i];
                arr[i] = temp1;

            }
        }
    }
}