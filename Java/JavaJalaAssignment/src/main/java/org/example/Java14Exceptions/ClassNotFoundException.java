package org.example.Java14Exceptions;

public class ClassNotFoundException {
    public static void main(String args[]){
        try{
            Class.forName("org.example.Java14Exceptions.ClassNotFoundException");
            ClassLoader.getSystemClassLoader().loadClass("ClassNotFoundException");
        }
        catch (java.lang.ClassNotFoundException cn){
            //cn.getException();
            cn.printStackTrace();
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }
    }
}
