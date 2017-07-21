package pkg2.uva.let1;

import java.util.Scanner;

public class WordScramble483 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuffer sb;

        while (sc.hasNext()){
            String text = sc.nextLine();
            String [] texts = text.split(" ");

            for (int i=0; i<texts.length; i++){
                sb = new StringBuffer(texts[i]);

                if(i==texts.length -1){
                    System.out.print(sb.reverse().toString());
                    break;
                }
                sb.reverse().toString();
                System.out.print(sb + " ");
            }
            System.out.println();
        }
    }
}
