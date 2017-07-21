package algorithm.dynamic;

public class BinomialCoefficient {

    public static void main(String[] args){

        System.out.println(coefficient(6,3));
        System.out.println(coefficieantDyn(4,2));

    }

    private static int coefficient(int n, int k){

        if (k == 0 || k==n)
            return 1;

        return coefficient(n-1, k-1) + coefficient(n-1, k);
    }

    private static int coefficieantDyn(int n, int k){
        int [][] C = new int[n+1][k+1];

        for (int i=0; i<=n; i++){

            for (int j=0; j<= Math.min(i,k); j++){

                if (j==0 || j==i){
                    C[i][j] = 1;
                }
                else {
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
                }
            }
        }

        return C[n][k];
    }
}
