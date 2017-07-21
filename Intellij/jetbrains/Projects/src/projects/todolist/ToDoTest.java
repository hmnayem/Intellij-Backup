package projects.todolist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ToDoTest {

    private LinkedList<TODO> todoList;
    private Scanner sc;

    public ToDoTest(){

        todoList = new LinkedList<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ToDoTest test = new ToDoTest();

        int choice;

        do {

            System.out.print("\033[H\033[2J");
            test.menu();
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1:
                    System.out.print("\033[H\033[2J");
                    if (test.todoList.isEmpty()) {
                        System.out.print((char)27 + "[31m");
                        System.out.println("No To Do Available");
                    }
                    else {
                        System.out.println((char) 27 + "[32m");
                        System.out.println("Your Next task is : ");
                        System.out.println(test.upNext());
                    }
                    break;

                case 2:
                    int ch;
                    do {
                        System.out.println("\033[H\033[2J");
                        test.allTodo();
                        System.out.print((char) 27 + "[32m");
                        System.out.println("\n\n\n\nEnter index number to view details and -1 to return");
                        ch = Integer.parseInt(br.readLine());
                        if (ch != -1) {
                            test.fullInfo(ch);
                            System.out.println();
                        }
                        test.pressEnter();
                    } while (ch != -1);

                    break;

                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.print((char) 27 + "[32m");
                    System.out.println("Please Fill The Form Below");
                    TODO todo = test.inpTodo();
                    test.todoList.add(todo);
                    Thread.sleep(200);
                    System.out.print((char) 27 + "[32m");
                    System.out.println("\n\nSuccessfully Added");
                    break;

                case 4:
                    System.out.print("\033[H\033[2J");
                    test.allTodo();
                    System.out.print((char) 27 + "[32m");
                    System.out.print("\nPlease Enter The Index Number : ");
                    int index = Integer.parseInt(br.readLine());
                    test.todoList.remove(index-1);

                    System.out.println("Successfully Deleted");
                    break;

                case 5:
                    choice = 0;
                    break;

                default:
                    System.out.println("Not A Valid Entry");
                    break;
            }
            test.pressEnter();

        } while (choice != 0);

    }

    private Date makeDate(int dayOfMonth, int noOfMonth, int hour, int minute) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.MONTH, noOfMonth);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        Date date = calendar.getTime();

        return date;
    }

    private TODO inpTodo(){

        String title, des, date;
        System.out.print((char)27 + "[34mEnter Title : ");
        title = sc.nextLine();
        System.out.print((char) 27 + "[34mEnter Description : ");
        des = sc.nextLine();
        System.out.print((char) 27 + "[34mEnter Expire Date(day month hour minute) : ");
        date = sc.nextLine();

        String[] dates = date.split(" ");
        int day = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int hour = Integer.parseInt(dates[2]);
        int minute = Integer.parseInt(dates[3]);

        TODO todo = new TODO(title, des, makeDate(day, month, hour, minute));

        return todo;

    }

    private TODO upNext(){

        TODO todo = todoList.peek();

        return todo;
    }

    private void allTodo(){

        if (todoList.isEmpty()) {
            System.out.println("No To Available");
            return;
        }

        System.out.println("ALl To Do List");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < todoList.size(); i++) {
            System.out.print((char)27 + "[32m");
            System.out.print(String.format("%3d%2s%-50s", (i + 1), ". ", todoList.get(i).getTitle()));
            System.out.print((char)27 + "[33m");
            System.out.println(String.format("%-50s", todoList.get(i).getDate().toString()));

            System.out.println();

        }

    }

    private void fullInfo(int index) {

        System.out.print((char)27 + "[32m");
        System.out.print(String.format("%3s%-50s", " ", todoList.get(index-1).getTitle()));
        System.out.print((char)27 + "[33m");
        System.out.println(String.format("%-50s", todoList.get(index-1).getDate().toString()));
        System.out.print((char)27 + "[35m");
        System.out.println(String.format("%-200s", todoList.get(index-1).getDescription()));
    }

    private void menu() {

        System.out.print((char)27 + "[31m");
        System.out.println("MAIN MENU ITEM");
        for (int i=0; i<20; i++) {
            System.out.print("-");
        }

        System.out.println();
        System.out.print((char)27 + "[35m");
        System.out.println("1. Next Task");
        System.out.println("2. View All Task");
        System.out.println("3. Add New Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print((char) 27 + "[33m");
        System.out.print("Please Select One : ");


    }

    private void pressEnter(){

        System.out.print((char) 27 + "[31m");
        System.out.println("Press Enter to key to continue...");
        try{
            System.in.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}












