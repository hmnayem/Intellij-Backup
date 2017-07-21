package icpcpkg.dynamicprogramming.fibo;

public class FiboDynamic {

    int [] keep = new int[100];

    public FiboDynamic(){
        fillWith();
    }

    public static void main(String...args){

        FiboDynamic fb = new FiboDynamic();
        int n = 8;

        System.out.println("Calculate Fibonacci with TD : " + fb.fibTD(n));
        System.out.println("Calculate Fibonacci with BU : " + fb.fibBU(n));

    }

    //Fibonacci TOP DOWN Method

    private void fillWith(){
        for (int i=0; i<100; i++){
            keep[i] = -1;
        }
    }

    private int fibTD(int n){
        if (keep[n] == -1){
            if (n<=1)
                keep[n] = n;
            else {
                keep[n] = fibTD(n-1)+fibTD(n-2);
            }
        }
        return keep[n];
    }

    private int fibBU(int n){
        int [] fibs = new int[n+1];
        fibs[0] = 0;
        fibs[1] = 1;

        for (int i=2; i<=n; i++){
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs[n];
    }
}
