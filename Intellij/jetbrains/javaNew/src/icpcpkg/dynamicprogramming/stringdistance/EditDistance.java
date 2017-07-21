package icpcpkg.dynamicprogramming.stringdistance;

public class EditDistance {

    public static void main(String...args){

        String X = "GeeeKS";
        String Y = "Geek";

        System.out.println(disRecursive(X, Y, X.length(), Y.length()));
        System.out.println(disDynamic(X, Y, X.length(), Y.length()));

    }

    private static int disRecursive(String X, String Y, int m, int n){
        if (m==0) return 0;
        if (n==0) return 0;

        if (X.charAt(m-1) == Y.charAt(n-1))
            return disRecursive(X, Y, m-1, n-1);

        return 1 + Math.min(disRecursive(X, Y, m, n-1),
                Math.min(disRecursive(X, Y, m-1, n), disRecursive(X, Y, m-1, n-1)));
    }

    private static int disDynamic(String X, String Y, int m, int n){
        int [][] dp = new int[m+1][n+1];

        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                if (i==0)
                    dp[i][j] = j;
                else if (j==0)
                    dp[i][j] = i;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
            }
        }

        return dp[m][n];
    }
}
