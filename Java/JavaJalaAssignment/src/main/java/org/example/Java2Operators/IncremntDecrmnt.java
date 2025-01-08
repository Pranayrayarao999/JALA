package org.example.Java2Operators;

public class IncremntDecrmnt {
    int a;
    int b;

    public int Increment(){
        a++;
        System.out.println(a);
        return a;
    }

    public int Decrement(){
        a--;
        System.out.println(a);
        return a;
    }

    static void preIncrement(int a, int b) {
        int d;                  //First the value of a is incremented to 11
        d = b + (++a);          //Then b is added to 11 to get 16
        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);//a=11,b=16
    }

    static void postIncrement(int a, int b) {
        int d;                  //first the value of a is added to b to get 15
        d = b + (a++);          //Then after execution, a is incremented to 11
        System.out.println("Values after Post-Increment a,b : " + a + "," + d);//a=11,b=15
    }

    static void preDecrement(int a, int b) {
        int d;                  //First the value of a is decremented to 9
        d = b + (--a);          //Then b is added to 9 to get 14
        System.out.println("Values after Pre-Decrement a,b : " + a + "," + d);//a=9,b=14
    }

    static void postDecrement(int a, int b) {
        int d;                  //first the value of a is added to b to get 15
        d = b + (a--);          //Then after execution, a is Decremented to 9
        System.out.println("Values after Post-Decrement a,b : " + a + "," + d);//a=9,b=15
    }

    public static void main(String args[]){
        IncremntDecrmnt id = new IncremntDecrmnt();
        id.a = 12;
        id.Increment();
        id.Decrement();

        id.preIncrement(10,5);
        id.postIncrement(10,5);
        id.preDecrement(10,5);
        id.postDecrement(10,5);
    }

}
