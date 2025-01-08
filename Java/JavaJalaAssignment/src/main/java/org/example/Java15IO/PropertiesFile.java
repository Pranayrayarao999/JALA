package org.example.Java15IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String args[]){

        try{
            Properties pr = new Properties();
            pr.put("Name","Pranay");
            pr.put("E.no","379");
            pr.put("College","GNIT");

            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            //Storing the properties file
            pr.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
