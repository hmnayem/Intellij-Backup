package icpcpkg.dynamicprogramming.lcs;

public class LCS {

    public static void main(String[] args){

        String X = "Happy New";
        String Y = "Happy Birth";

        System.out.println(lcs(X,Y));
        System.out.println("Recursive Version : " + lcsRecursive(X,Y,X.length(),Y.length()));

    }

    private static int lcs(String X, String Y){
        int [][] L = new int[X.length()+1][Y.length()+1];

        for (int i=0; i<=X.length(); i++){
            for (int j=0; j<=Y.length(); j++){

                if (i==0 || j==0)
                    L[i][j] = 0;

                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = 1 + L[i-1][j-1];

                else
                    L[i][j] = Math.max(L[i-1][j] , L[i][j-1]);
            }
        }

        return L[X.length()][Y.length()];
    }

    private static int lcsRecursive(String X, String Y, int m, int n){
        if (m==0 || n==0)
            return 0;

        if (X.charAt(m-1) == Y.charAt(n-1))
            return 1 + lcsRecursive(X, Y, m-1, n-1);

        return Math.max(lcsRecursive(X,Y, m-1, n), lcsRecursive(X, Y, m, n-1));
    }
}

