package pkg2.uva.let1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem12577 {

    public static void main(String[] args) throws IOException{

        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(In);

        String input = br.readLine();

        int caseNo = 0;

        while (!input.equals("*")){
            if(input.equals("Hajj")){
                System.out.println("Case " + (++caseNo) + ": Hajj-e-Akbar");
            }else if(input.equals("Umrah")){
                System.out.println("Case " + (++caseNo) + ": Hajj-e-Asghar");
            }
            input = br.readLine();
        }
    }
}
