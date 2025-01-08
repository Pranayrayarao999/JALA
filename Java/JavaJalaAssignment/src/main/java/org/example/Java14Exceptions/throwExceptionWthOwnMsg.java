package org.example.Java14Exceptions;

public class throwExceptionWthOwnMsg {
    public static void main(String args[]){
        try{
            String msg = "Hello World";
            throw new Exception(msg);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
