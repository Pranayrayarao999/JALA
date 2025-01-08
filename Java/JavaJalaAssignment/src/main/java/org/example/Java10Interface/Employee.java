package org.example.Java10Interface;

public class Employee implements Company{
    double salary = 10000.0034;
    String name = "Raja";

    @Override
    public void Salary() {
        System.out.println("SALARY CREDITED :"+salary);
    }

    @Override
    public void Operations() {
        System.out.println("OPERATIONS TEAM ASSEMBLE : "+name);
    }

    @Override
    public void SameMethod(int n) {

    }
}
