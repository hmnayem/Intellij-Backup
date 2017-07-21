package pkg4.arraytest;

import java.util.Scanner;

public class ArrayOperationProject {

    private static int size = 0;
    private static int[] array = new int[1000];

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        boolean status = true;
        System.out.print("\033[H\033[2J");

        do {
            displayMenu();
            int choice = sc.nextInt();
            int number, index;

            switch (choice){

                case 1:
                    System.out.println("Enter Value to add");
                    number = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                    add(number);
                    break;

                case 2:
                    System.out.println("Enter Value to Insert");
                    number = sc.nextInt();
                    System.out.println("Enter index number");
                    index = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                    insert(index, number);
                    break;

                case 3:
                    System.out.println("Enter an index to delete");
                    index = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                    delete(index);
                    break;

                case 4:
                    System.out.print("\033[H\033[2J");
                    display();
                    break;

                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.println("There are total : " + getSize() + " elements");
                    break;

                case 6:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Sum is : " + sumOfElements());
                    break;

                case 7:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Average is : " + averageOfElements());
                    break;

                case 8:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Maximum value is : " + max());
                    break;

                case 9:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Minimum Value is : " + min());
                    break;

                case 10:
                    System.out.print("\033[H\033[2J");
                    printEven();
                    break;

                case 11:
                    System.out.print("\033[H\033[2J");
                    printOdd();
                    break;

                case 12:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Enter a value to search");
                    number = sc.nextInt();

                    if (search(number) != -1)
                        System.out.println("The element " + number + " is at index " + search(number));
                    else
                        System.out.println("The element " + number + " not found");

                    break;

                case 13:
                    status = false;
                    break;
            }

        }while (status);




    }

    private static void add(int data){
        array[size++] = data;
    }

    private static void insert(int pos, int data){
        for (int i=size; i>pos; i--){
            array[i] = array[i-1];
        }

        array[pos] = data;
        size++;
    }

    private static void delete(int pos){

        for (int i=pos; i<size-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    private static int getSize(){
        return size;
    }

    private static void display(){

        if(getSize() == 0){
            System.out.println("Array is Empty");
            return;
        }

        for (int i=0; i<size; i++)
            System.out.print("\t" + array[i]);

        System.out.println();
    }

    private static int sumOfElements(){
        int sum = 0;
        for (int i=0; i<size; i++){
            sum += array[i];
        }

        return sum;
    }

    private static double averageOfElements(){
        return (double)sumOfElements()/getSize();
    }

    private static int max(){
        int max = array[0];

        for (int i=1; i<size; i++){
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    private static int min(){
        int min = array[0];

        for (int i=1; i<size; i++){
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    private static int search(int data){
        for (int i=0; i<size; i++){
            if (array[i] == data)
                return i;
        }
        return -1;
    }

    private static void printEven(){
        System.out.print("Even Values Are: ");
        for (int i=0; i<size; i++){
            if (array[i] % 2 == 0)
                System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    private static void printOdd(){
        System.out.print("Odd Values Are: ");
        for (int i=0; i<size; i++){
            if (array[i] % 2 != 0)
                System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    private static void displayMenu(){


        System.out.println("\t\tSelect A Menu");
        System.out.print("\t\t");
        for (int i=1; i<=25; i++)
            System.out.print("#");

        System.out.println("\n\t\t1.\tAdd Item");
        System.out.println("\t\t2.\tInsert Item");
        System.out.println("\t\t3.\tDelete Item");
        System.out.println("\t\t4.\tDisplay Elements");
        System.out.println("\t\t5.\tTotal Elements");
        System.out.println("\t\t6.\tSum of Elements");
        System.out.println("\t\t7.\tAverage of Elements");
        System.out.println("\t\t8.\tMaximum Value");
        System.out.println("\t\t9.\tMinimum Value");
        System.out.println("\t\t10.\tPrint Even numbers");
        System.out.println("\t\t11.\tPrint Odd Numbers");
        System.out.println("\t\t12.\tSearch Element");
        System.out.println("\t\t13.\tExit");

        System.out.print("\t\t");
        for (int i=1; i<=25; i++)
            System.out.print("#");

        System.out.println();
        System.out.print("\t\tEnter Your Choice : ");
    }
}
