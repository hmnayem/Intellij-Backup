package pkg4.multidimentinalarray;

public class CircularRotation {

    public static void main(String[] args){

        int [][] matrix = {
                {1,2,3},
                {3,1,2},
                {3,1,2}
        };

        String rotateString = "";
        boolean isrotate = false;


         for (int i=0; i<matrix[0].length; i++){

             rotateString += matrix[0][i];
         }

         rotateString += rotateString;


        for (int i=1; i<matrix.length; i++){

            String row = "";

            for (int j=0; j<matrix[i].length; j++){
                row += matrix[i][j];
            }

            if (rotateString.contains(row))
                isrotate = true;
            else
                isrotate = false;

        }

        System.out.println(isrotate);
    }
}
