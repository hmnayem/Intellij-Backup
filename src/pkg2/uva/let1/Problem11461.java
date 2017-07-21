package pkg2.uva.let1;

import java.util.Scanner;

public class Problem11461 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start!=0 && end != 0){

            int count = 0;

            for(int i=start; i<=end; i++){
                if(isSquare(i)) count++;
            }

            System.out.println(count);

            start = sc.nextInt();
            end = sc.nextInt();
        }
    }

    public static boolean isSquare(int n){
        double rootValue;

        rootValue = Math.sqrt(n);

        return rootValue == (int) rootValue;
    }
}
