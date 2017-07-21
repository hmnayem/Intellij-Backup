package pkg2.uva.let1;

import java.util.Scanner;

public class TexQuotes272 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String line;
        boolean open = true;
        boolean end = false;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == '\u001a'){
                    end = true;
                    break;
                }
                if(line.charAt(i) == '\"') {
                    if(open == true) {
                        System.out.print("``");
                        open = false;
                        continue;
                    } else {
                        System.out.print("''");
                        open = true;
                        continue;
                    }
                }
                System.out.print(line.charAt(i));
            }
            System.out.print("\n");
        }
    }
}
