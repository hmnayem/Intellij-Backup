package algorithm.dynamic;

public class LongestCommonSubSequence {

    public static void main(String...args){

        String str1 = "JAVA IS AWESOME";
        String str2 = "ADA IS AWESOME";

        System.out.println("Length of LCS10405 is : " + lcsDynamic(str1, str2, str1.length(), str2.length()));

    }

    private static int lcsRecursive(String X, String Y, int m, int n){
        if (n==0 || m==0)
            return 0;

        if (X.charAt(m-1) == Y.charAt(n-1))
            return 1 + lcsRecursive(X,Y, m-1, n-1);

        return Math.max(lcsRecursive(X, Y, m, n-1), lcsRecursive(X, Y, m-1, n));
    }

    private static int lcsDynamic(String X, String Y, int m, int n){

        int [][] L = new int[m+1][n+1];

        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                if (i==0 || j==0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        return L[m][n];
    }
}















