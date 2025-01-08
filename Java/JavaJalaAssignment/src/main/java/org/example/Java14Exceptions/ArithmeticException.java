package org.example.Java14Exceptions;

public class ArithmeticException extends Throwable {
    public static void main(String args[]){
        try{
            int a=0;
            int b=5;
            int c =b/a;
        }
        catch(java.lang.ArithmeticException ae){
            ae.printStackTrace();
        }
        finally{
            System.out.println("FINALLY BLOCK");
        }
    }
}
