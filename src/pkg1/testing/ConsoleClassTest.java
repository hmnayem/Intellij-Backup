package pkg1.testing;

import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConsoleClassTest {

    public static void main(String[] args){

        Console console = System.console();

        if (console != null){
            Calendar c = new GregorianCalendar();
            console.printf("Welcome %l$s%n", "Shegufa");
            console.printf("Current time is : %l$tm %l$te, %l$tY%n", c);
            console.flush();
        }else {
            System.out.println("No console attached");
        }
    }
}
