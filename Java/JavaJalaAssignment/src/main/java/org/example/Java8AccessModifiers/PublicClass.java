package org.example.Java8AccessModifiers;

public class PublicClass {

    public String name = "Raja";

    public void publicMethod(){
        System.out.println("HELLO : "+name);
    }

    public static void main(String args[]){
        PublicClass pc = new PublicClass();
        pc.publicMethod();
        pc.name = "Pranay";
        pc.publicMethod();

    }
}
