package uva.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange674 {

    public static void main(String[] args){

        int [] coin = {1,5, 10, 25, 50};

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int amount = sc.nextInt();
            System.out.println(change(coin, coin.length, amount));
        }

    }

    private static long change(int[] coins, int size, int amount){

        long [] table = new long[amount+1];

        Arrays.fill(table, 0);
        table[0] = 1;

        for (int i=0; i<size; i++){

            for (int j=coins[i]; j<=amount; j++){

                table[j] += table[j-coins[i]];
            }
        }

        return table[amount];
    }
}
