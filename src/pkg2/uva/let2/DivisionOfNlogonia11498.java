package pkg2.uva.let2;

import java.util.Scanner;

public class DivisionOfNlogonia11498 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, px, py, x, y;

        n = sc.nextInt();

        while (n!=0){
            px = sc.nextInt();
            py = sc.nextInt();

            while (n-- > 0){
                x = sc.nextInt();
                y = sc.nextInt();

                if (x == px || y == py)
                    System.out.println("divisa");
                else if (x < px && y > py)
                    System.out.println("NO");
                else if (x > px && y > py)
                    System.out.println("NE");
                else if (x > px && y < py)
                    System.out.println("SE");
                else if (x < px && y < py)
                    System.out.println("SO");
            }

            n = sc.nextInt();
        }
    }
}
