package pkg2.uva.let1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11417Clone {

    public static void main(String[] args) throws IOException {
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(In);

        int N = Integer.parseInt(br.readLine());

        while (N!=0){

            long G = 0;

            for(int i=1; i<N; i++){
                for(int j=i+1; j<=N; j++){
                    G += gcd(i, j);
                }
            }
            System.out.println(G);
            N = Integer.parseInt(br.readLine());


        }
    }

    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
}
