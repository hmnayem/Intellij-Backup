package shegufa;

import java.util.Scanner;

public class ThreadClass {

    public static void main(String[] args) throws InterruptedException {

        Thread displayWish = new Thread(){
            public void run(){
                do {
                    try {
                        wish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while (true);
            }
        };

        Thread displayLine = new Thread(){
            public void run(){
                for (int i=0; i<=35; i++){
                    System.out.print("# ");
                    try {
                        Thread.sleep(350);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread other = new Thread(){
            public void run(){
                System.out.println("Other thread");
            }
        };

        displayWish.start();
        displayLine.start();
        other.start();
    }

    private static void wish() throws InterruptedException {

        String[] msg = {"Many Many Happy returns of the day" , "Happy Birth Day Shegufa"};
        for (int i=0; i<msg.length; i++){
            System.out.print("\033[H\033[2J");
            if ((i+1) % 2 == 0)
                System.out.print("\t");
            for (int j=0; j<msg[i].length(); j++){
                System.out.print(msg[i].charAt(j) + " ");
                Thread.sleep(350);
            }
            System.out.println();
        }
    }



}
