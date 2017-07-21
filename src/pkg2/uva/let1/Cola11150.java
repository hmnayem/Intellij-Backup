package pkg2.uva.let1;

import java.util.Scanner;

public class Cola11150 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int n = sc.nextInt();
            int half, sum;

            half = n/2;
            sum = half+n;

            System.out.println(sum);
        }
    }
}
