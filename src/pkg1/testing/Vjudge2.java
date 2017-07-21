package pkg1.testing;

import java.util.Scanner;

public class Vjudge2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            int temp = 0;

            while (n > 0){
                count += n;
                temp += n;
                n = temp/k;
                temp %= k;
            }

            System.out.println(count);
        }
    }

}
