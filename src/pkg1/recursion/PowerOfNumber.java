package pkg1.recursion;

public class PowerOfNumber {

    public static void main(String[] args){

        System.out.println("Using power method 1: ");
        System.out.println(pow1(3,4));

        System.out.println("Using power method 2: ");
        System.out.println(pow2(3,4));

    }

    private static long pow1(long x, long n){
        if (n == 0)
            return 1;

        return x * pow1(x, n-1);
    }

    private static long pow2(long x, long n){
        if (n==0)
            return 1;
        else if (n%2==0){
            long y = pow2(x, n/2);
            return y*y;
        }
        else
            return x * pow2(x, n-1);
    }
}
