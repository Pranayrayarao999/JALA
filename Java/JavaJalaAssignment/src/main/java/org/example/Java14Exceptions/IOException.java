package org.example.Java14Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException  {
    public static void main(String args[]){
        File f = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            fis.read();
            fis.close();
        }
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
