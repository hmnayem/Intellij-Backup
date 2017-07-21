package pkg1.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> names = new LinkedList<>();


        boolean choice = true;

        while (choice){
            String str = br.readLine();
            names.add(str);

            System.out.println("Wanna more input?(type 0 or 1)");
            int n = Integer.parseInt(br.readLine());
            if(n == 0) choice = false;
            else choice = true;
        }

        ListIterator lit = names.listIterator();

        System.out.println("\nYou have Entered");

        while (lit.hasNext()){
            System.out.print(lit.next() + "    ");
        }

        Collections.sort(names);

        System.out.println("\nNames are in Ascending Order : ");

        ListIterator lit1 = names.listIterator();

        while (lit1.hasNext()){
            System.out.print(lit1.next() + "    ");
        }

        System.out.println("\nNames are in Descending Order : ");

        ListIterator lit2 = names.listIterator();

        while (lit2.hasPrevious()){
            System.out.print(lit2.previous() + "    ");
        }

        System.out.println("\nNames after shuffling");

        Collections.shuffle(names);

        ListIterator lit3 = names.listIterator();

        while (lit3.hasNext()){
            System.out.print(lit3.next() + "    ");
        }

        System.out.println();

    }
}
