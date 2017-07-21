package pkg1.lambdas;


import java.util.stream.IntStream;

public class IntStreamOperation {

    public static void main(String[] args){

        int[] vals = {3,7,2,6,1,8,9,4,5,10};

        System.out.print("Original values : ");
        IntStream.of(vals)
                .forEach(val -> System.out.print(val + "  "));

        System.out.println();

        System.out.println("Count : " + IntStream.of(vals).count());
        System.out.println("Min : " + IntStream.of(vals).min().getAsInt());
        System.out.println("Max : " + IntStream.of(vals).max().getAsInt());
        System.out.println("Sum : " + IntStream.of(vals).sum());
        System.out.println("Average : " + IntStream.of(vals).average().getAsDouble());

        System.out.println("Sum via reduce method : " + IntStream.of(vals).reduce(0,(x,y) -> x+y));
        System.out.println("Sum of squares via reduce method : " + IntStream.of(vals).reduce(0, (x,y) -> x + y*y));
        System.out.println("Product via reduce method : " + IntStream.of(vals).reduce(1, (x,y) -> x*y));

        System.out.print("Even values in sorted order : ");
        IntStream.of(vals)
                .filter(val -> val%2 == 0)
                .sorted()
                .forEach(val -> System.out.print(val + "  "));
        System.out.println();

        System.out.print("Odd values multiply by 10 in sorted order : ");
        IntStream.of(vals)
                .filter(val -> val%2 != 0)
                .map(val -> val * 10)
                .sorted()
                .forEach(val -> System.out.print(val + "  "));
        System.out.println();

        System.out.println("Sum of integers from 1 to 9 : " + IntStream.range(1,10).sum());
        System.out.println("SUm of integers from 1 to 10 : " + IntStream.rangeClosed(1,10).sum());
    }
}
