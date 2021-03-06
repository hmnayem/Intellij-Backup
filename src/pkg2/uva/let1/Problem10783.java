package pkg2.uva.let1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10783 {

    public static void main(String[] args) throws IOException{

        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(In);

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 1; t<=testCase; t++){
            int start = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine());
            int sum = 0;

            for(int i=start; i<=end; i++){
                if(i%2 != 0)
                    sum += i;
            }
            System.out.println("Case " + t + ": " + sum);
        }
    }
}
