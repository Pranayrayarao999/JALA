package org.example.Java8AccessModifiers;

public class Protected {
    protected int id = 11;
    protected String name="Raju";

    protected void display(){
        System.out.println(id+ " " +name);
    }

    public static void main(String args[]){
        Protected p = new Protected();
        p.display();
    }

}
