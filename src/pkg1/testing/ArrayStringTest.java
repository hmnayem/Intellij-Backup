package pkg1.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStringTest {

    public static void main(String[] args) throws IOException, Throwable{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The Size of The Array");
        int size = Integer.parseInt(br.readLine());

        String [] names = new String[size];
        System.out.println("\nEnter the Names");
        String name = "";

        for(int i=0; i<names.length; i++){
            name = br.readLine();
            names[i] = name;
        }

        System.out.println("Array Initialization is finished...");

        for(String nm : names){
            System.out.print(nm + "   ");
        }

        System.out.println();
    }
}
