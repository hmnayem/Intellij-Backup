package pkg2.uva.let1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base11121 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        int cases=Integer.parseInt(br.readLine());
        for(int i=1;i<cases+1;i++) {
            int x=Integer.parseInt(br.readLine());
            sb.append("Case #").append(i).append(": ").append(binary(x)).append("\n");
        }
        System.out.print(sb);
    }

    static String binary(long n) {
        StringBuilder temp=new StringBuilder();
        while(true){
            if(n==0){
                temp.append("0");
                break;
            }
            if(n==1){
                temp.append("1");
                break;
            }
            if(n==-1){
                temp.append("11");
                break;
            }
            if(n%2==0){
                n/=-2;
                temp.append("0");
            }else{
                n--;
                n/=-2;
                temp.append("1");
            }
        }
        return temp.reverse().toString();
    }
}
