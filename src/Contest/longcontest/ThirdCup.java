package Contest.longcontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdCup {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int t=1; t<=testCase; t++){
            int size = Integer.parseInt(br.readLine());
            String [] numbers = br.readLine().split(" ");
            int [] values = new int[size];

            for (int i=0; i<size; i++){
                values[i] = Integer.parseInt(numbers[i]);
            }

            Arrays.sort(values);

            int total = 0, min=values[size-1];

            for (int i=size-1, j=1; i>=0; i--, j++){
                total += values[i];

                if (values[i] < min)
                    min = values[i];

                if (j%3 == 0)
                    total = total - min;

            }

            System.out.println("Case #" + t + ": " + total);

        }
    }
}
