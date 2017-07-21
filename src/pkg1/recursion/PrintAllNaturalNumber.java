package pkg1.recursion;

public class PrintAllNaturalNumber {

    public static void main(String[] args){

        printNumber(5, 25);
        System.out.println();
        printEven(10, 60);
        System.out.println();
        printOdd(10, 60);
        System.out.println();
        System.out.println(sum(100));

    }

    private static void printNumber(int low, int high){
        if (low > high)
            return;

        System.out.print(low + "\t");

        printNumber(low+1, high);
    }

    private static void printEven(int low, int high){
        if (low > high) return;

        if (low%2 == 0)
            System.out.print(low + "\t");

        printEven(low+1, high);
    }

    private static void printOdd(int low, int high){
        if (low > high) return;

        if (low%2 != 0)
            System.out.print(low + "\t");

        printOdd(low+1, high);
    }

    private static long sum(long N){

        if (N == 0) return 0;

        return N + sum(N-1);

    }
}
