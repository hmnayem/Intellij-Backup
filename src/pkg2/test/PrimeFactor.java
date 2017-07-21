package pkg2.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static void main(String[] args){
        int x = 144;
        for (Integer i : primeFactors(x))
            System.out.print(i + " ");

    }

    public static List<Integer> primeFactors(int number){
        int n = number;

        List<Integer> factors = new ArrayList<>();
        for(int i=2; i<=n/i; i++){
            while (n%i == 0){
                factors.add(i);
                n /= i;
            }
        }
        if(n > 1){
            factors.add(n);
        }
        return factors;
    }


}
