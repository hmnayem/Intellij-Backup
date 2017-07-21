package projects.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTesting {

    public static void main(String[] args){
        final String path = "/home/guru/Desktop/example.txt";

        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
