package pkg2.uva.let1;

import java.util.Scanner;

public class TrainSwapping299 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0){
            int len = sc.nextInt();
            int[] values = new int[len];
            int count=0;

            for (int i=0; i<values.length; i++){
                values[i] = sc.nextInt();
            }

            for (int i=0; i<values.length; i++){
                for(int j=i+1; j<values.length; j++){
                    if (values[i] > values[j])
                        count++;
                }
            }

            System.out.println("Optimal train swapping takes " + count + " swaps.");
        }
    }
}
