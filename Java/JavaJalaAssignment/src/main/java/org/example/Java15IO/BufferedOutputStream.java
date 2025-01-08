package org.example.Java15IO;

import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.OutputStream;
import java.io.*;

public class BufferedOutputStream {
    public static void main(String args[]){
        String s ="HELLO THIS IS BUFFERED OUTPUT STREAM";
        try{
            // BufferedOutputStream is a subclass of OutputStream
            FileOutputStream fos = new FileOutputStream("bos.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//            byte[] arr = s.getBytes();
//            // write() method writes data to the output stream
//            bos.write(arr);
//            //closing streams
//            bos.close();
//            fos.close();
//            System.out.println("Data is written to the file.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
