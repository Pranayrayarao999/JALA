package org.example.Java12Constructor;

public class Constructor3 extends Constrructor{
    public String clg;

    public Constructor3(String clg) {
        this.clg = clg;
        System.out.println(clg);
    }

    public Constructor3(int id, String clg) {
        super(id);
        this.clg = clg;
        System.out.println(id +" "+clg);
    }

    public Constructor3(String name, double salary, String clg) {
        super(name, salary);
        this.clg = clg;
        System.out.println(name+" "+salary+ " "+clg);
    }

    public static void main (String args[]){
        Constructor3 c3 = new Constructor3("JNTUH");
        Constructor3 c4 = new Constructor3(23,"OU");
        Constructor3 c5 = new Constructor3("GNIT",23456.78,"JNTUH");

    }
}
