package org.example.Java8AccessModifiers;

public class ProtectedMain {
    public static void main(String args[]){
        Protected p = new Protected();
        p.id = 45;
        p.name = "Raju";
        p.display();

        //we cannot access these in other packages but using inheritance we can use in other subclasses.
    }
}
