package shegufa;

import java.io.IOException;

public class TimerClass {

    public static void main(String... args) throws InterruptedException, IOException {


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
