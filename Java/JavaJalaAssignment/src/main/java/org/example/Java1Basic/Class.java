package org.example.Java1Basic;

public class Class {
    // attribute/object
    int id;

    //method
    public void call(){
        System.out.println("HELLO:"+id);
    }

    public static void main(String args[]) {
        Class cl = new Class();
        cl.call();
    }
}
