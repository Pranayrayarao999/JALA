package org.example.Java10Interface;

public class StrictMain implements Strict{
    @Override
    public void Good() {
        System.out.println("GOOD");
    }

    //even though we implemented we cannot use private method even after implementing because private is private(access only in class)

    public static void main(String args[]){
        StrictMain sm = new StrictMain();
        sm.Good();
        //printing static final variable here
        System.out.println(sm.name);
        System.out.println(sm.num);
        System.out.println(sm.n34);

        Strict s = new StrictMain();
        //you cannot overide final
        //Strict.name = "Sathish";
    }

}
