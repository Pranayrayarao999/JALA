package org.example.Java14Exceptions;

import java.lang.reflect.Method;

public class NoSuchMethodException {
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    public static void main (String args[]){
        try{
            Class c = Class.forName("org.example.Java14Exceptions.NoSuchMethodException");
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException c ){
            c.printStackTrace();
        }
    }
}
