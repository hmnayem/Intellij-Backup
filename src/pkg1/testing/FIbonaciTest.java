package pkg1.testing;


public class FIbonaciTest {

    public static long fib(long n){
        if(n <= 1){
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        long x = 50;
        System.out.println(fib(x));
        long end = System.currentTimeMillis();

        System.out.println( "Total time elapsed " + (end-start));
    }
}
