package projects.contactlist;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyContact {

    private static BufferedReader br;
    private static ContactList people;

    private MyContact(){
        people = new ContactList();
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        MyContact contact = new MyContact();
        boolean choice = true;
        int num;
        do {
            System.out.println();
            contact.displayMenu();
            num = sc.nextInt();
            System.out.println();

            switch (num){
                case 1:
                    System.out.print("\033[H\033[2J");
                    contact.view();
                    contact.pressAnyKey();
                    break;

                case 2:
                    System.out.print("\033[H\033[2J");
                    contact.addContact();
                    contact.pressAnyKey();
                    break;

                case 3:
                    System.out.print("\033[H\033[2J");
                    contact.delete();
                    contact.pressAnyKey();
                    break;

                case 4:
                    System.out.print("\033[H\033[2J");
                    contact.searchContact();
                    contact.pressAnyKey();
                    break;

                case 5:
                    System.out.print("\033[H\033[2J");
                    choice = false;
                    contact.pressAnyKey();
                    break;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Invalid Selection");
                    contact.pressAnyKey();
                    break;
            }
        }while (choice);

    }

    private void addContact() throws IOException {

        System.out.println("\tEnter Name");
        System.out.print("\t");
        String name = br.readLine();

        System.out.println("\n\tEnter Phone Number");
        System.out.print("\t");
        String number = br.readLine();

        System.out.println("\n\tSelect Your Relation");
        System.out.println("\tFamily(1)\tFriend(2)\tOther(3)");
        System.out.print("\t");
        int relation = Integer.parseInt(br.readLine());

        people.insert(new ContactInformation(name, number, relation));
        System.out.println("\n\n\tNew Contact Added Successfully...");
    }

    private void view(){
        if (people.isEmpty()){
            System.out.println("\tThere are no contact");
        }else {

            System.out.print("\t");
            for(int i=1; i<=60; i++){
                System.out.print("*");
            }
            System.out.println();

            for (int i=1; i<=people.getSize(); i++){
                System.out.println("\t" + i + people.get(i));
            }

            System.out.println("\n\t\tThere are Total " + people.getSize() + " contact" + (people.getSize()>1?"s":""));
        }
    }

    private void delete() throws IOException {
        char ch;
        view();
        System.out.print("\t\tEnter the index number of your contact : ");
        int index = Integer.parseInt(br.readLine());
        System.out.print("\033[H\033[2J");
        System.out.print("\n\tAre you sure to delete this contact?(y/n) : ");
        ch = br.readLine().charAt(0);
        if (ch=='y' || ch=='Y'){
            people.delete(index);
            System.out.println("\n\tContact deleted Successfully...");
        }
        else System.out.println("\tDeletion Canceled");
    }

    private void searchContact() throws IOException {
        System.out.print("\t\tPlease Enter Phone Number OR Name : ");
        String value = br.readLine();
        int found = people.search(value);

        if (found!=-1){
            System.out.println("\t" + people.get(found));
        }
        else {
            System.out.println("\tContact Not Found");
        }
    }

    private void displayMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("\t\t\tContact List PROJECT\n\n");
        System.out.print("\t\t");
        for(int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("\t\t1.\tMy Contacts");
        System.out.println("\t\t2.\tAdd New Contacts");
        System.out.println("\t\t3.\tDelete Contact");
        System.out.println("\t\t4.\tSearch Contact");
        System.out.println("\t\t5.\tExit");
        System.out.print("\t\t");
        for(int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\t\tChoose from above : ");
    }

    private void pressAnyKey(){
        System.out.print("\nPress Enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
