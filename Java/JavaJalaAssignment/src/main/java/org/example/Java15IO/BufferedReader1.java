package org.example.Java15IO;

import org.example.Java7Inheritence.B;

import java.io.*;

public class BufferedReader1 {
    public static void main(String args[]){
        try{
            FileReader fr = new FileReader("fw1.txt");
            BufferedReader br = new BufferedReader(fr);
            int i;
            while((i = br.read()) != -1){
                System.out.print((char) i);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
