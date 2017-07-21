package pkg2.uva.let2;

import java.util.Scanner;

public class HelloWorld11636 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int totalCase = 1;

        while (true){
            int total = sc.nextInt();

            if(total < 0) break;

            int count = 0, i=1;

            while (i<total){
                i *= 2;
                count++;
            }

            System.out.println("Case " + totalCase++ + ": " + count);
        }
    }
}
