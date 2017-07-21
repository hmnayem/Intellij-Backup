package pkg4.arraytest;

public class SecondMax {

    public static void main(String[] args){

        int [] numbers = new int[25];

        for (int i=0; i<numbers.length; i++){

            numbers[i] = (int)(Math.random()*50) + 1;
        }

        System.out.println("Array Elements are : ");

        for (int x : numbers)
            System.out.print("\t" + x);

        System.out.println("\nSecond max is : " + secondMax(numbers));


    }

    public static int secondMax(int [] array){

        int max = array[0], second = 0;

        for (int i=1; i<array.length; i++){

            if (array[i] > max){
                max = array[i];
            }

            if (array[i] > second && array[i] < max)
                second = array[i];
        }

        return second;
    }
}
