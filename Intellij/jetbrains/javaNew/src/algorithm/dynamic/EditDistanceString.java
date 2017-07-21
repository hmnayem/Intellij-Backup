package algorithm.dynamic;

public class EditDistanceString {

    public static void main(String...args){

        String str1 = "2017";
        String str2 = "2091670";

        System.out.println(editDistDynamic(str1, str2, str1.length(), str2.length()));


    }

    private static int min(int x, int y, int z){

        if (x<y && x<z)
            return x;

        if (y<z && y<x)
            return y;

        return z;
    }

    private static int editDist(String X, String Y, int m, int n){

        if (m==0) return n;
        if (n==0) return m;

        if (X.charAt(m-1) == Y.charAt(n-1))
            return editDist(X, Y, m-1, n-1);

        return 1 + min(editDist(X, Y, m, n-1),
                editDist(X, Y, m-1, n),
                editDist(X, Y, m-1, n-1));
    }

    private static int editDistDynamic(String X, String Y, int m, int n){
        int [][] dp = new int[m+1][n+1];

        for (int i=0; i<=m ; i++){
            for (int j=0; j<=n; j++){

                if (i==0)
                    dp[i][j] = j;

                else if (j==0)
                    dp[i][j] = i;

                else if (X.charAt(i-1) == Y.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];

                else dp[i][j] = 1 + min(
                        dp[i][j-1], dp[i-1][j], dp[i-1][j-1]
                    );
            }
        }

        return dp[m][n];
    }
}

























