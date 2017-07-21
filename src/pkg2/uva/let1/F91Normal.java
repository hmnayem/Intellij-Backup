package pkg2.uva.let1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F91Normal {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        while ((n=Integer.parseInt(br.readLine())) != 0){
            int m = n;
            if(n > 100)
                n -= 10;
            else
                n = 91;

            System.out.println("f91(" + m + ") = " + n);
        }
    }
}
