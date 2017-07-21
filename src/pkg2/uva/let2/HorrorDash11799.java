package pkg2.uva.let2;

import java.util.Arrays;
import java.util.Scanner;

public class HorrorDash11799 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t=1; t<=testCase; t++){
            int std = sc.nextInt();
            int[] speeds = new int[std];
            for (int i=0; i<speeds.length; i++){
                speeds[i] = sc.nextInt();
            }
            Arrays.sort(speeds);
            int max = speeds[speeds.length-1];

            System.out.println("Case " + t + ": " + max);
        }
    }
}
