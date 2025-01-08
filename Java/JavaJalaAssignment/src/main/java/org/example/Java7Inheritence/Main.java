package org.example.Java7Inheritence;

public class Main {
    public static void main (String args[]){
        A a1 = new A();
        a1.A1();
        a1.A2();
        a1.A3();

        B b1 = new B();
        b1.A1();
        b1.A2();
        b1.B1();
        b1.B2();

        C c1 = new C();
        c1.A1();
        c1.A2();
        c1.A3();
        c1.C1();
        c1.C2();

        //calling overridden method with super class reference
        A orm = new A();
        //UPCASTING
        orm = new B();
        orm.A1();
        orm = new C();
        orm.A1();

        //data members /variables
        A rtp = new A();
        System.out.println(rtp.n);
        B rtp1 = new B();
        System.out.println(rtp1.n);
        C rtp2 = new C();
        System.out.println(rtp2.n);

    }
}
