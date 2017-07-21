package pkg2.test;

public class Divisor {

    public static void main(String[] args){

        System.out.println(divisorCount(24));

    }

    public static int divisorCount(int n) {
        int count = 1;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                count++;

        return count;
    }
}
