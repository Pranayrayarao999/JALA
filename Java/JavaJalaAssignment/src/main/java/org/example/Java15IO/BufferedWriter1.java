package org.example.Java15IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main (String args[]){
        String s = "Hello world how are you ????? ";

        try{
            FileWriter fw = new FileWriter("fw1.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(s);
            bw.close();
            System.out.println("DATA IS WRITTENNNN");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
