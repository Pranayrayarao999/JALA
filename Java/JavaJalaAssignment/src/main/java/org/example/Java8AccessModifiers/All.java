package org.example.Java8AccessModifiers;

public class All {

    //Public - available in all classes and also in other packages classes & non-classes.
    public String name;
    // Protected - avaialble in all classes of same package and also available in other package classes, not avaialable in non class
    protected String company;
    //default - available in same package
    int empid;
    //Private Available in on same class not other claases, package
    private double Salary;

    //   private<default<protected< public

    public void display(){
        System.out.println(empid+ " "+company+ " "+name);
    }

}
