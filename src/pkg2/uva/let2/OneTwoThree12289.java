package pkg2.uva.let2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree12289 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i=1; i<=testCase; i++){
            String s = br.readLine();
            System.out.println(getNumber(s));
        }
    }

    private static int getNumber(String str){
        if(str.length() == 3){
            int one = 0, two = 0;
            if(str.charAt(0) == 'o')
                one++;

            if(str.charAt(1) == 'n')
                one++;

            if(str.charAt(2) == 'e')
                one++;

            if(str.charAt(0) == 't')
                two++;

            if(str.charAt(1) == 'w')
                two++;

            if(str.charAt(2) == 'o')
                two++;

            if(one > two)
                return 1;
            else return 2;
        }
        else return 3;
    }
}
