package org.example.Java14Exceptions;

public class StringIndexOutOfBoundsException {
    public static void main (String args[]){
        String nm = "Sharan";
        try{
            char charAtNegativeIndex = nm.charAt(-1);
            char charAtLengthIndex = nm.charAt(11);
        }
        catch (java.lang.StringIndexOutOfBoundsException si){
            si.printStackTrace();
        }
    }
}
