package icpcpkg.dynamicprogramming.coinchange;

import java.util.Arrays;

public class CoinChanging {

    public static void main(String[] args){

        int [] coin = {1,2,5};

        System.out.println(change(coin, coin.length, 10));

    }

    private static long change(int [] coin, int size, int amount){

        long [] table = new long[amount+1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i=0; i<size; i++){

            for (int j=coin[i]; j<=amount; j++){
                table[j] += table[j-coin[i]];
            }
        }

        return table[amount];
    }
}
