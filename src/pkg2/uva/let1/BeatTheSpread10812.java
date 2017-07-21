package pkg2.uva.let1;

import java.util.Scanner;

public class BeatTheSpread10812 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sa = Math.abs(a + b) / 2;
            int sb = sa - b;
            if (sa + sb != a || sa - sb != b || sa < 0 || sb < 0) {
                System.out.println("impossible");
            } else {
                System.out.println(Math.max(sa, sb) + " " + Math.min(sa, sb));
            }
        }
    }
}
