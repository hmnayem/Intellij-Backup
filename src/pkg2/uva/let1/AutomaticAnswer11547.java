package pkg2.uva.let1;

import java.util.Scanner;

public class AutomaticAnswer11547 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0){
            int n = sc.nextInt();

            n *= 567;
            n /= 9;
            n += 7492;
            n *= 235;
            n /= 47;
            n -= 498;

            n/=10;
            int temp = n%10;

            System.out.println(Math.abs(temp));

        }
    }
}
