package org.example.Java10Interface;

public class TwoInterfaceSameMethod implements Emp2,Company {
    @Override
    public void Salary() {

    }

    @Override
    public void Operations() {

    }

    @Override
    public void Hey() {
        System.out.println("THIS IS DEFAULT METHOD");
    }

    @Override
    public void SameMethod(int n) {
        System.out.println("TWO INTERFACES SAME METHOD " +n);
    }
}
