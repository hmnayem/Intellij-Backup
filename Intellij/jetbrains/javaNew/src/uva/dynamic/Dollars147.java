package uva.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Dollars147 {

    public static void main(String[] args){

        int [] dollars = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};

        Scanner sc = new Scanner(System.in);
        String amount = sc.nextLine();
        while (!amount.equals("0.00")){

            int temp = intAmount(amount);

            long total = change(dollars, dollars.length, temp);
            System.out.println(String.format("%6s%17d", amount, total));

            amount = sc.nextLine();


        }

    }

    private static long change(int[] coins, int size, int amount){

        long[] table = new long[amount+1];

        Arrays.fill(table,0);
        table[0] = 1;

        for (int i=0; i<size; i++){

            for (int j=coins[i]; j<=amount; j++){

                table[j] += table[j - coins[i]];
            }
        }

        return table[amount];
    }

    private static int intAmount(String fs){
        StringBuffer sb = new StringBuffer();

        int[] ar = new int[fs.length()];
        for (int i=0; i<fs.length(); i++){
            if(fs.charAt(i) != '.')
                ar[i] = Character.getNumericValue(fs.charAt(i));
            else
                ar[i] = -1;
        }

        for (int i=0; i<ar.length; i++){
            if (ar[i] != -1)
                sb.append(ar[i]);
        }
        return Integer.parseInt(sb.toString());
    }

}
