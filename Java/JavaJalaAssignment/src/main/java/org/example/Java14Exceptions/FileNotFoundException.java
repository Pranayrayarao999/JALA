package org.example.Java14Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String args[]){
        try {
            //FileReader f = new FileReader(new File("/invalid/file/location"));
            BufferedReader br = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("FILENOTFOUNDEXCEPTION CAUGHT");
            e.printStackTrace();
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }

    }
}
