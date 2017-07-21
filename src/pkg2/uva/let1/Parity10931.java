package pkg2.uva.let1;


import java.util.Scanner;

public class Parity10931 {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        while(sc.hasNext())
        {
            int i=sc.nextInt();
            if(1<=i)
            {
                String j=Integer.toBinaryString(i);
                int k=Integer.bitCount(i);
                System.out.printf("The parity of %s is %d (mod 2).\n", j, k);
            }
        }

    }

}
