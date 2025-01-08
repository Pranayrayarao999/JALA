package org.example.Java12Constructor;

public class Constructor2 {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    //default access modifier
//    PublicPrivateProtectedDefault() {
//        this(11);
//    }

    //public access modifier
//    public PublicPrivateProtectedDefault(int rollNo) {
//        this("Sharan");
//        this.rollNo = rollNo;
//        System.out.println("rollNo : " + rollNo);
//    }

    //private access modifiers
//    private PublicPrivateProtectedDefault(String name) {
//        this("ICFAI", "Hyderabad");
//        this.name = name;
//        System.out.println("Name : " + name);
//    }

    //protected access modifiers
//    protected PublicPrivateProtectedDefault(String clg, String city) {
//        this.clg = clg;
//        this.city = city;
//        System.out.println("college : " + clg);
//        System.out.println("City : " + city);
//    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        Constructor2 c2 = new Constructor2();
    }



}
