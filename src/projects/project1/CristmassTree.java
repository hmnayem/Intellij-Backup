package projects.project1;

public class CristmassTree {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n\n");

        for (int i=0; i<=5; i++){

            for (int j=15; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<(2*i)+1; j++){
                System.out.print("*");
                Thread.sleep(250);
            }
            System.out.println();
        }
        Thread.sleep(1000);
        for(int i=2; i<6; i++){
            for (int j=15; j>i; j--)
                System.out.print(" ");

            for (int j=1; j<=(i*2)+1; j++){
                System.out.print("*");
                Thread.sleep(250);
            }

            System.out.println();
        }

        Thread.sleep(1000);
        for (int i=3; i<10; i++){
            for (int j=15; j>i; j--){
                System.out.print(" ");
            }

            for (int j=1; j<=(i*2)+1; j++){
                System.out.print("*");
                Thread.sleep(250);
            }
            System.out.println();
        }

        Thread.sleep(1000);
        for (int i=1; i<=5; i++){
            for (int j=1; j<=14; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=3; j++){
                System.out.print("*");
                Thread.sleep(300);
            }

            System.out.println();
        }

        Thread.sleep(1000);
        for (int i=1; i<=12; i++){
            System.out.print(" ");
        }

        for (int i=1; i<=7; i++){
            System.out.print("*");
            Thread.sleep(300);
        }
        System.out.println();
    }
}
