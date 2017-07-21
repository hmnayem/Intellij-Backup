package uva.dynamic;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class LetMeCount357 {

    public static void main(String[] args){

        int [] coins = {1, 5, 10, 25, 50};
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int amount = sc.nextInt();
            System.out.println("There are " + change(coins,coins.length, amount) + " ways to produce " + amount + " cents change.");
        }

    }

    private static BigInteger change(int [] coins, int size, int amount){

        BigInteger [] table = new BigInteger[amount+1];

        Arrays.fill(table, BigInteger.ZERO);
        table[0] = BigInteger.ONE;

        for (int i=0; i<size; i++){
            for (int j=coins[i]; j<=amount; j++){
               table[j] = table[j].add(table[j-coins[i]]);
            }
        }

        return table[amount];
    }
}
