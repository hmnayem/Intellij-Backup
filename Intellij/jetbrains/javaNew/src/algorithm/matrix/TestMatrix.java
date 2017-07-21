package algorithm.matrix;

import java.util.Scanner;

public class TestMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("ENTER Value For a 3x3 Matrix");

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                String x = sc.next();
                matrix[i][j] = Integer.parseInt(x);
            }
        }

        System.out.println();
        System.out.println("You have entered : ");
        display(matrix);
        System.out.println();
        inverseMatrix(matrix);

    }

    private static int minor(int [][] matrix, int n, int m) {

        int [][] minors = new int[2][2];
        int k=0, l=0;

        for (int i=0; i<matrix.length; i++) {

            for (int j=0; j<matrix.length; j++) {

                if (i!=n && j!=m) {
                    minors[k][l] = matrix[i][j];
                    if (l<1)
                    {
                        l++;
                    }
                    else if(k<1){
                        l=0;
                        k++;
                    }
                }
            }
        }

        return ((minors[0][0]*minors[1][1]) - (minors[0][1]*minors[1][0]));
    }

    private static int cofactor(int [][] matrix, int n, int m)
    {
        if ((n+m)%2==0)
            return minor(matrix, n, m);

        return (-minor(matrix, n, m));
    }

    private static int[][] transpose(int [][] matrix){

        int [][] trans = new int[matrix.length][matrix.length];

        for (int i=0; i<matrix.length; i++){

            for (int j=0; j<matrix.length; j++) {

                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }

    private static int determinant(int [][] matrix){

        int sum = 0;

        for (int i=0; i<matrix.length; i++){

            if (i%2==0){
                sum += (matrix[0][i] * (minor(matrix, 0, i)));
            }
            else {
                sum -= (matrix[0][i] * (minor(matrix, 0, i)));
            }
        }
        return sum;
    }

    private static void inverseMatrix(int [][] matrix){

        int [][] cofact = new int[matrix.length][matrix.length];
        int [][] adjoint;

        int determ = determinant(matrix);

        if (determ == 0){
            System.out.println("Inverse Matrix Impossible Due to Determination is 0!!!");
            return;
        }

        for (int i=0; i<matrix.length; i++) {

            for (int j=0; j<matrix.length; j++) {

                cofact[i][j] = cofactor(matrix, i, j);
            }
        }

        adjoint = transpose(cofact);

        System.out.println("Cofactor Matrix of the Given Matrix is : ");
        display(cofact);

        System.out.println();
        System.out.println("Adjoint Matrix of the Given Matrix is : ");
        display(adjoint);

        System.out.println();
        System.out.println("Inverse Matrix of the Given Matrix is : ");

        for (int i=0; i<adjoint.length; i++){

            for (int j=0; j<adjoint.length; j++) {

                System.out.print(String.format("%5s%2s", adjoint[i][j]%determ==0?adjoint[i][j]/determ: adjoint[i][j]>=0?(""+adjoint[i][j]+"/"+determ):(""+adjoint[i][j]+"/"+determ), "|"));

            }
            System.out.println();
            System.out.println("---------------------");
        }


    }

    private static void display(int [][] matrix){

        System.out.println("----------------");

        for (int i=0; i<matrix.length; i++) {

            for (int j=0; j<matrix.length; j++) {

                System.out.print(String.format("%s%3d%s", "|", matrix[i][j], " "));
            }
            System.out.println("|");
            System.out.println("----------------");
        }
    }
}
