package org.example.Java11ThisAndSuper;

public class Child extends Parent{
    public void Method3(){
        super.Method2();
    }

    public void Method4(){
        this.Method2();
    }
}
