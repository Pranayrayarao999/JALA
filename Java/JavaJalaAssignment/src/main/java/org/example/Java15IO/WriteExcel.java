package org.example.Java15IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteExcel {
    public static void main(String args[]){
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1,"Raju");
        h1.put(2,"Pranay");

        try {
            File f = new File("My.xlsx");
            FileWriter fw = new FileWriter(f);
            fw.write(String.valueOf(h1));
            System.out.println("DATA IS ENTERED IN EXCEL");
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
