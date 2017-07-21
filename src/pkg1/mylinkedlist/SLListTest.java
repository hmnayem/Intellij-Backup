package pkg1.mylinkedlist;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLListTest {

    public static void main(String[] args) throws IOException{

        SLList list = new SLList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int index;
        boolean run = true;

        System.out.println("1. Add Item\n" +
                "2. Add Item at specified Index\n" +
                "3. Get Item from specifed Index\n" +
                "4. Remove Item at specified Index\n" +
                "5. Get size\n" +
                "6. View List\n" +
                "7. Exit");

        do {
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(br.readLine());

            switch (choice){

                case 1:
                    System.out.println("Enter data");
                    name = br.readLine();
                    list.add(name);
                    break;

                case 2:
                    System.out.println("Enter Data and index");
                    name = br.readLine();
                    index = Integer.parseInt(br.readLine());
                    list.add(name, index);
                    break;

                case 3:
                    System.out.println("Enter index number");
                    index = Integer.parseInt(br.readLine());
                    list.get(index);
                    break;

                case 4:
                    System.out.println("Enter index number");
                    index = Integer.parseInt(br.readLine());
                    list.remove(index);
                    break;

                case 5:
                    System.out.println("There are total " + list.getSize() + " elements");
                     break;

                case 6:
                    System.out.println("List : " + list);
                    break;
                case 7:
                    run = false;
                    break;


                default:
                    System.out.println("Not a valid Entry");
                    break;
            }

        }while (run);
    }
}
