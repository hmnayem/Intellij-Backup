package pkg2.uva.let1;

import java.util.Scanner;

public class CountinGame494 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            boolean isCount = true;
            int count = 0;
            String str = sc.nextLine();
            char[] words = str.toCharArray();

            for (char ch : words){
                if(Character.isLetter(ch)){
                    if(isCount){
                        count++;
                        isCount = false;
                    }
                }
                else {
                    isCount = true;
                }
            }
            System.out.println(count);
        }
    }
}
