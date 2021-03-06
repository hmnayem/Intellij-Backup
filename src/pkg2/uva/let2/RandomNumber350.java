package pkg2.uva.let2;

import java.util.Scanner;

public class RandomNumber350 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int c = 1;

        while (true){
            int z = sc.nextInt();
            int i = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            if(z==0 && i==0 && m==0 && l==0) break;

            System.out.println("Case " + c++ + ": " + getLength(z,i,m,l));
        }
    }

    private static int getLength(int z, int i, int m, int l){
        int temp = -999, count=0;
        int seez = (z * l + i) % m;
        l = seez;

        while (seez != temp){
            temp = (z * l + i) % m;
            l = temp;
            count++;
        }

        return count;
    }
}
