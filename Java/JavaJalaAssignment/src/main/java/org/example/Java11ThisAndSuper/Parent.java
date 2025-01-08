package org.example.Java11ThisAndSuper;

public class Parent {
    //this() is used to access variables and methods, super() to call constructors and methods

    public int id;

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    void Method1(){
        System.out.println("USED THIS() AND SUPER()");
    }

    void Method2(){
        System.out.println("METHOD2");
    }
}
