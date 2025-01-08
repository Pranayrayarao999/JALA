package org.example.Java14Exceptions;

public class NullPointerException {
    public static void simpleNullCheck(String str){
        System.out.println(str.length());
    }

    public static void main (String args[]){
        String input = null;
        try{
            simpleNullCheck(input);
        }
        catch (java.lang.NullPointerException nu){
            System.out.println("NULL POINTER EXCEPTION CAUGHT");
            nu.printStackTrace();
        }
    }
}
