package pkg1.generics;

import java.util.Arrays;

public class GenericMethods1 {

    public static <T> void printArr(T[] arr){

        for(T t : arr)
            System.out.print(t + "    ");
        System.out.println();

    }

    public static <T> void changeArr(T[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args){

        Integer[] intArr = {1,8,2,9,35,6,7};
        Double[] dobArr = {4.5,5.6,1.2,2.3,3.4,6.7};
        String[] nameArr = {"Shegufa", "Nowrin", "Koli", "Pipasa", "Pritha", "Mim"};

        System.out.println("Integers Array : ");
        printArr(intArr);

        System.out.println("Double Array : ");
        printArr(dobArr);

        System.out.println("String Array : ");
        printArr(nameArr);

        System.out.println("Integers sort Array : ");
        changeArr(intArr);
        printArr(intArr);

        System.out.println("Double sort Array : ");
        changeArr(dobArr);
        printArr(dobArr);

        System.out.println("String sort Array : ");
        changeArr(nameArr);
        printArr(nameArr);
    }
}
