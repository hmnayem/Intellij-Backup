package pkg2.uva.let1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigMod374 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        StringBuffer sb = new StringBuffer("");
        String m = "";
        boolean flag=false;
        while ((m=br.readLine())!=null) {
            int b=0;
            if("".equals(m))
                b=Integer.parseInt(br.readLine());
            else
                b=Integer.parseInt(m);
            int p=Integer.parseInt(br.readLine());
            int mm=Integer.parseInt(br.readLine());
            flag=true;
            BigInteger bg=BigInteger.valueOf(b);
            bg=bg.modPow(BigInteger.valueOf(p), BigInteger.valueOf(mm));
            sb.append(bg).append("\n");
        }
        System.out.print(sb);
    }
}

