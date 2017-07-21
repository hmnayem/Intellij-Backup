package algorithm.dynamic;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args){

        int [] arr = {1,2,5};

        System.out.println(changeCount(arr, arr.length, 10));
        System.out.println(change(arr, arr.length, 10));

    }

    private static int changeCount(int [] S, int m, int n){
        int [][] table = new int[n+1][m];

        for (int i=0; i<m; i++){
            table[0][i] = 1;
        }

        for (int i=1; i<n+1; i++){
            for (int j=0; j<m; j++){
                int x = (i-S[j]>=0? table[i-S[j]][j] : 0);
                int y = (j>=1)? table[i][j-1]:0;

                table[i][j] = x+y;
            }
        }

        return table[n][m-1];
    }

    private static long change(int [] S, int m, int n){
        long [] table = new long[n+1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i=0; i<m; i++){
            for (int j=S[i]; j<=n; j++){
                table[j] += table[j-S[i]];
            }
        }
        return table[n];
    }
}














