package com.garjs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONTester {

    public static void main(String[] args) {

        String data = readFile("data.json");

        System.out.println(data);


    }

    private static String readFile(String filename) {
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/guru/Documents/Program/Programming/IDEs/Intellij/jetbrains/DataStructures/src/com/garjs" + filename));
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
