package org.example.Java14Exceptions;

public class NumberFormatException {
    public static void main(String args[]){
        String str = "111BCA";
        try{
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        }
        catch (java.lang.NumberFormatException ne){
            ne.printStackTrace();
        }
    }
}
