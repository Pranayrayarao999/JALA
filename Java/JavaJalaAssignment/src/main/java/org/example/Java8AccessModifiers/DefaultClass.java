package org.example.Java8AccessModifiers;

public class DefaultClass {
    String name;
    int id;

    public void display(){
        System.out.println(name +" " +id);
    }

    public static void main(String args[]){
        DefaultClass dc = new DefaultClass();
        dc.id=5;
        dc.name = "Satya";
        dc.display();
    }

}
