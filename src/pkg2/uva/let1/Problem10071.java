package pkg2.uva.let1;

import java.util.Scanner;

public class Problem10071 {

    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        while(in.hasNext())
        {
            int a=in.nextInt();
            int b=in.nextInt();

            int res = a*b*2;

            System.out.println(res);

        }
    }
}
