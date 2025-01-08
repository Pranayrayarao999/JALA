package org.example.Java14Exceptions;
import java.lang.ArithmeticException;

public class ProgramWithArithmeticExceptionWithoutErrHandling {
    public static void main(String args[]){
        //With Exception Handling
        int a=10;
        int b=0;
        try{
            int d = a+b;
            System.out.println(d);
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ae){
            System.out.println("error");
            ae.printStackTrace();
        }

        //Without Exception Handling
//        int a=10;
//        int b=0;
//        int c =a/b;
//        System.out.println(c);
    }
}
