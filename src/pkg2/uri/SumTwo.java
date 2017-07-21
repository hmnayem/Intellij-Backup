package pkg2.uri;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwo {
    public static void main(String[] args)throws IOException{

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int X = A + B;

        System.out.println("X = " + X);
    }
}
