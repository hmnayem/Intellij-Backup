package algorithm.dynamic;

public class FibonacciNumber {

    long [] lookup = new long[100];

    public FibonacciNumber(){
        initialize();
    }

    public static void main(String...args){

        long start, end;

        FibonacciNumber fn = new FibonacciNumber();
        start = System.currentTimeMillis();
        System.out.println(fn.fib(55));
        end = System.currentTimeMillis();
        System.out.println("Total Time Elapsed : " + (end-start));

        start = System.currentTimeMillis();
        System.out.println(fn.fibDynamic(55));
        end = System.currentTimeMillis();
        System.out.println("Total Time Elapsed : " + (end-start));

    }

    public void initialize(){

        for (int i=0; i<100; i++){
            lookup[i] = -1;
        }
    }

    public long fibDynamic(int n){
        if (lookup[n] == -1){
            if (n<=1)
                lookup[n] = n;
            else
                lookup[n] = fibDynamic(n-1) + fibDynamic(n-2);
        }
        return lookup[n];
    }

    public long fib(int n){
        if (n<=1)
            return n;

        return fib(n-1) + fib(n-2);
    }

}
