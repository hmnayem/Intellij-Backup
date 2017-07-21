package pkg2.uva.let1;

import java.io.*;

public class TheDecoder458 {

    public static void main(String[] args) throws IOException{

        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
        int h = 0;
        while ((h = in.read()) != -1) {
            out.write((Character.isSpace((char) h) ?
                    h : (h - 7)));
        }

    }
}
