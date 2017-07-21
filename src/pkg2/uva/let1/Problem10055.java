package pkg2.uva.let1;


import java.util.Scanner;

public class Problem10055 {

    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        while(in.hasNext())
        {
            long a=in.nextLong();
            long b=in.nextLong();
            if(a>b)
                System.out.println(a-b);
            else
                System.out.println(b-a);

        }
    }
}
