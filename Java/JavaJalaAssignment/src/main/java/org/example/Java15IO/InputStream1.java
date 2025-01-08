package org.example.Java15IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream1 {
    public static void main (String args[]){
        try {
            InputStream is = new FileInputStream("os.txt");
            int i;
            while((i= is.read())!= -1){
                System.out.print((char)i);
            }

            is.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
