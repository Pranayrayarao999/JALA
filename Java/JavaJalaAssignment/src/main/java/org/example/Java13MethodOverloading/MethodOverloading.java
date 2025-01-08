package org.example.Java13MethodOverloading;

public class MethodOverloading {
    int id;
    String name;
    double salary;

    //Method overloading - same method name but different parameters, sequence, datatypes.
    public void M1(int id){
        System.out.println(id);
    }

    public void M1(int id, int no){
        System.out.println(id +" "+no);
    }

    public void M1(int id, String name){
        System.out.println(id +" "+name);
    }

    public void M1(int id, String name,double salary){
        System.out.println(id+" "+name+" "+salary);
    }

    public void M1(double salary){
        System.out.println(salary);
    }

    public static void main(String args[]){
        MethodOverloading mo = new MethodOverloading();
        mo.M1(1);
        mo.M1(2,45);
        mo.M1(1,"Raju");
        mo.M1(1,"Raju",23000.456);
        mo.M1(23000.45);
        //mo.M1("Hii");

    }
}
