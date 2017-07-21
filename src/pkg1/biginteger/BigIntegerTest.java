package pkg1.biginteger;

public class BigIntegerTest {

    public static void main(String[] args){

        double sum=0;
        int m=3, n=2;

        for (int i=1; i<20; i+=2){
            sum += (double)i/m;
            System.out.println(i + "/" + m + " = " + sum);
            int temp = n;
            n = m;
            m = n+temp;
        }

    }
}
