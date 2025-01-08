package org.example.Java15IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExcel {
    public static void main(String args[]){
        try{
            String str;
            FileReader fr = new FileReader("My.xlsx");
            BufferedReader br = new BufferedReader(fr);
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
