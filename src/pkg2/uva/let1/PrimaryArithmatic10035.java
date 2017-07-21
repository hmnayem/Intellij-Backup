package pkg2.uva.let1;

import java.util.Scanner;

public class PrimaryArithmatic10035 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long m, n;

        while (true){
            int count=0, temp=0;
            m = sc.nextInt();
            n = sc.nextInt();

            if(m==0 && n==0) break;

            while (n>0 || m>0){
                long a = m%10;
                long b = n%10;

                m/=10;
                n/=10;

                if(a+b+temp >= 10){
                    count++;
                    temp=1;
                }
                else temp=0;
            }

            if (count <= 0)
                System.out.println("No carry operation.");
            else
                System.out.println(count + " carry operation" + ((count==1)?"." : "s."));
        }
    }
}

