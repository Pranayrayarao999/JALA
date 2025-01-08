package org.example.Java12Constructor;

public class Constrructor {
    public int id;
    public String name;
    public double salary;

    //default constructor
    public Constrructor() {
    }

    //Parameterized contructor(single argument)
    public Constrructor(int id) {
        this.id = id;
        System.out.println(id);
    }

    //Parameterized constructor(Two arguments)
    public Constrructor(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(name+" " +salary);
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String args[]){
        Constrructor c = new Constrructor(1);
        Constrructor c1 = new Constrructor("Raju",23456.789);

    }
}
