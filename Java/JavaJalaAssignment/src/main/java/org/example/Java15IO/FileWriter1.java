package org.example.Java15IO;

import java.io.FileWriter;

public class FileWriter1 {
    public static void main(String args[]){
        String s = "Hello How Are you Mava ???";
        try{
            FileWriter fw = new FileWriter("fw.txt");
            fw.write(s);
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }
    }
}
