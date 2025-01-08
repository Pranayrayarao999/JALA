package org.example.Java15IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream1 {
    public static void main(String args[]){
        try {
            FileInputStream fis = new FileInputStream("os.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while((i = bis.read()) != -1){
                System.out.print((char) i);
            }

            bis.close();
            fis.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
