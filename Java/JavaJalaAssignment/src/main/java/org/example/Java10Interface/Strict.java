package org.example.Java10Interface;

public interface Strict {
    //INTERFACE CANNOT BE PRIVATE OR PROTECTED
    //private methods in interfaces should have body or else it gives error
    //protected methods give error cant create it.
    private void Hello(){};
    public void Good();

    static final String name = "Rajuu";
    public int num = 35;
    final int n34 = 99;
    //errors
//    private int n1 =45;
//    protected int n2 = 46;

}
