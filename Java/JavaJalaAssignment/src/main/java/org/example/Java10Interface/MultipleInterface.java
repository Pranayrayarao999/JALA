package org.example.Java10Interface;

public class MultipleInterface implements Company, Emp2{
    @Override
    public void Salary() {
        System.out.println("SALARYYY : MULTIPLE INTERFACES ALLOWED");
    }

    @Override
    public void Operations() {
        System.out.println("OPERATIONSS : MULTIPLE INTERFACES ALLOWED");
    }

    @Override
    public void SameMethod(int n) {

    }

    @Override
    public void Hey() {
        System.out.println("HEYY : MULTIPLE INTERFACES ALLOWED");
    }
}
