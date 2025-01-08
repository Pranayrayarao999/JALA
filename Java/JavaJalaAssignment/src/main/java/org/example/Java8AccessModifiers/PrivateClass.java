package org.example.Java8AccessModifiers;

public class PrivateClass {
    private int id;
    private String name;

    private void Hello(){
        System.out.println("HEllo "+id+" " +name );
    }

    public static void main(String args[]){
        PrivateClass pc = new PrivateClass();
        pc.id = 11;
        pc.name = "Satya";
        pc.Hello();
    }
}
