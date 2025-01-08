package org.example.Java14Exceptions;

public class FinallyBlock {
    public static void main (String args[]){
        try{
            int a = 10;
            int b = 4;
            int c = a+b;
            System.out.println(c);

            int d = 0;
            int e = 0;
            int g = d/0;
            System.out.println(g);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("FINALLY BLOCK ");
        }
    }

}
