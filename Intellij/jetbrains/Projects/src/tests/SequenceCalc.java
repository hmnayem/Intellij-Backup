package tests;


public class SequenceCalc {

    public static void main(String[] args) {

        String inp = "34 + 21 + 45";

        String[] parts = inp.split(" ");
        int sum = 0, num = 0;

        for (int i=0; i<parts.length; i++) {

            if (!parts[i].equals("+")) {
                num = Integer.parseInt(parts[i]);
                sum += num;
            }

        }

        System.out.println("Sum Is : " + sum);

    }
}
