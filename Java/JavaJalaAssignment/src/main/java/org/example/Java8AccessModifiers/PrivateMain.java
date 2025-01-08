package org.example.Java8AccessModifiers;

public class PrivateMain  {
    public static void main(String args[]){
        PrivateClass pc = new PrivateClass();
        //you cannot access them because these are private
//        pc.id = 11;
//        pc.name = "Satya";
//        pc.Hello();
    }
}
