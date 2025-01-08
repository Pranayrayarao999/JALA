package org.example.Java5Static;

public class Classwithstaticnonstaic {
//    2static variables,2 instance variables, 2 static method, 2 instance method, main method

    // 2Static variables
    static int sv1 = 11;
    static int sv2 = 22;

    //2 Instance variables
    int iv1 = 33;
    int iv2 = 44;

    //2 Static methods
    public static void Hello(){
        System.out.println("HELLO JALA ACADEMYY "+sv1+" " +sv2);
        //printing of instance variables in static method
        Classwithstaticnonstaic cs = new Classwithstaticnonstaic();
        System.out.println(cs.iv1+ " " +cs.iv2);
    }
    public static void Jala(){
        System.out.println("JALA ACADEMYYY DEVELOPER");
    }

    //2 Instance method
    public void Instance(){
        //printing of static variables in instance method
        System.out.println("PRINTING STATIC VARIABLES IN INSTANCE METHOD " +sv1+" " + sv2);
        //calling of static method in instance method
        Hello();
    }

    public void Hey(){
        System.out.println("HEYY");
    }

    public static void main(String args[]){
        System.out.println(sv1+" " +sv2 );
        Classwithstaticnonstaic cs = new Classwithstaticnonstaic();
        System.out.println(cs.iv1+" " +cs.iv2);

        Hello();
        Jala();
        cs.Instance();
        cs.Hey();
    }
}
