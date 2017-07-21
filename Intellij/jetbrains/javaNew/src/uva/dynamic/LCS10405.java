package uva.dynamic;

import java.util.Scanner;

public class LCS10405 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         while (sc.hasNext()){
             String str1 = sc.nextLine();
             String str2 = sc.nextLine();

             System.out.println(sub(str1,str2, str1.length(), str2.length()));
         }

    }

    private static int sub(String X, String Y, int m, int n){

        int [][] L = new int[m+1][n+1];

        for (int i=0; i<=m; i++){

            for (int j=0; j<=n; j++){

                if (i==0 || j==0)
                    L[i][j] = 0;

                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1]+1;

                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        return L[m][n];
    }
}


