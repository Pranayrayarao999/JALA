package org.example.Java15IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String args[]){
        try{
            int i;
            FileReader fr = new FileReader("fw.txt");
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }

            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
