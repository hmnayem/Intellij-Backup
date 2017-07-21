package pkg1.lambdas;


import java.util.stream.IntStream;

public class InputStreamOperation {

    public static void main(String[] args){
        int[] values = {3,10,6,1,4,8,2,5,9,7};

        System.out.print("Original Values : ");
        IntStream.of(values)
                .forEach(value -> System.out.print(value + "  "));
        System.out.println();

        System.out.println("Count : " + IntStream.of(values).count());
        System.out.println("Min : " + IntStream.of(values).min().getAsInt());
        System.out.println("Max : " + IntStream.of(values).max().getAsInt());
        System.out.println("Sum : " + IntStream.of(values).sum());
        System.out.println("Average : " + IntStream.of(values).average().getAsDouble());

        System.out.println("Sum via reduce method : " + IntStream.of(values).reduce(0,(x,y) -> x+y));
        System.out.println("Sum of square via reduce method : " + IntStream.of(values).reduce(0, (x,y) -> x + y*y));
        System.out.println("Product via reduce method : " + IntStream.of(values).reduce(1, (x,y) -> x*y));

        System.out.print("Even values in sorted order : ");
        IntStream.of(values)
                .filter(value -> value%2 == 0)
                .sorted()
                .forEach(value -> System.out.print(value + "  "));
        System.out.println();

        System.out.print("Odd values multiply by 10 in sorted order : ");
        IntStream.of(values)
                .filter(value -> value%2 != 0)
                .map(value -> value*10)
                .sorted()
                .forEach(val -> System.out.print(val + "  "));
        System.out.println();

        System.out.println("Sum of integers form 1 to 9 : " + IntStream.range(1,10).sum());
        System.out.println("Sum of integers from 1 to 10 : " + IntStream.rangeClosed(1,10).sum());


    }
}
