package pkg1.testing;

import java.util.Scanner;

public class vjudge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            int count=0, sum, get;

            System.out.println("To role press 'r' or 'R'");
            String input = sc.next();

            if (input.toLowerCase().charAt(0) == 'r'){

                get = (int)(Math.random()*6) + 1;

                if (get == 6){

                    count++;
                    sum = get;

                    while (get == 6){
                        if (count%3 == 0)
                            sum = 0;

                        System.out.println("Role Again'");
                        input = sc.next();
                        get = (int)(Math.random()*6) + 1;
                        sum += get;
                        count++;
                    }

                }
                else {
                    sum = get;
                }

                System.out.println("You have got " + sum + " move");

            }
            else break;

        }

    }
}
