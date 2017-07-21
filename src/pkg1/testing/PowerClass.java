package pkg1.testing;


public class PowerClass {

    public static void main(String[] args){

        long st = System.currentTimeMillis();
        System.out.println(power(23,15));
        long end = System.currentTimeMillis();

        System.out.println("Time elapsed : " + (end-st));

        long st1 = System.currentTimeMillis();
        System.out.println(pow(23,15));
        long en = System.currentTimeMillis();

        System.out.println("Time elapsed : " + (en-st1));
    }

    private static long power(long x, long n){
        if(n==0)
            return 1;

        return x * power(x,n-1);
    }

    private static long pow(long x, long n){
        if (n==0)
            return 1;

        else if(n%2 == 0){
            long f = pow(x, n/2);
            return f*f;
        }
        else return x * pow(x, n-1);
    }
}
