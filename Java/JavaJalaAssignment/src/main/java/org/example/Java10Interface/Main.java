package org.example.Java10Interface;

public class Main {
    public static void main(String args[]){
        Employee e = new Employee();
        e.name = "Sathish";
        e.salary = 12000.345;
        e.Salary();
        e.Operations();

        MultipleInterface mi = new MultipleInterface();
        mi.Salary();
        mi.Operations();
        mi.Hey();

        TwoInterfaceSameMethod tw = new TwoInterfaceSameMethod();
        tw.SameMethod(5);
        tw.Hey();
    }
}
