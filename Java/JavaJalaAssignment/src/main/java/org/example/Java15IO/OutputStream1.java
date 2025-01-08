package org.example.Java15IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream1 {
    public static void main(String args[]){
        String data = "hELLO wORLD HOW ARE YOU ??";

        try{
            OutputStream os = new FileOutputStream("os.txt");

            // Converts the string into bytes
            byte[] db = data.getBytes();

            os.write(db);
            System.out.println("DATA IS WRITTEN TO FILE");

            os.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY BLOCKK");
        }
    }
}
