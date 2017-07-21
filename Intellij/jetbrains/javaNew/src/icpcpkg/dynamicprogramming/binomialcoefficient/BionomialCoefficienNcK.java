package icpcpkg.dynamicprogramming.binomialcoefficient;

public class BionomialCoefficienNcK {

    public static void main(String[] args){

        System.out.println(coefficientDynamic(10, 3));
        System.out.println(coefficientRecursive(15,6));

    }

    private static int coefficientRecursive(int n, int k){

        if (k==0 || k==n)
            return 1;

        return coefficientRecursive(n-1, k-1) + coefficientRecursive(n-1, k);
    }

    private static int coefficientDynamic(int n, int k){

        int [][] C = new int[n+1][k+1];

        for (int i=0; i<=n; i++){

            for (int j=0; j<= Math.min(i,k); j++){

                if (j==0 || j==i)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        return C[n][k];
    }
}
