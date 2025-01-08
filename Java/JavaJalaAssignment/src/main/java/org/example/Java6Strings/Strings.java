package org.example.Java6Strings;

public class Strings {
    public static void main (String args[]){
    // Different ways of creating string
    String s1 = "Hiii";
    String s2 = new String("HOW ARE YOU ??");

    //CONCATENATION
    String s3 = s1 + s2;
    System.out.println(s3);
    System.out.println(s1 + s2);

    //LENGTH OF THE STRING
    int s4 = s3.length();
    System.out.println(s4);

    //EXTRACT A STRING USING SUBSTRING
    String s5="Hello Macha ";
    String s6 = s5.substring(2,6);
    System.out.println(s6);

    //Search of Strings using indexOf
     String name = "Pranay";
     System.out.println(name.indexOf('n'));

    //Matching a string Using Regular Expression with matches()
        String ms = "Matching a String";
        // Testing if regex is present or not
        boolean match = ms.matches("(.*)String(.*)");
        //Boolean value, returns true if matches else false
        System.out.println("Matches : " + match);

     //COMPARING STRINGS USING EQUALS()
     String a = "Hiii";
     String b ="Hiiii";
     boolean c = a.equals(b);
     System.out.println(c);
     boolean d = a.equalsIgnoreCase(b);
     System.out.println(d);
     String e = "Heyy Myann How are u?";
     boolean f =e.startsWith("Heyy");
     System.out.println(f);
     boolean g=e.endsWith("?");
     System.out.println(g);
     String h = "Heyyy";
     String i ="Hey";
     int j = h.compareTo(i);
     System.out.println(j);

     //Trims - removes white spaces at both ends of string
     String trm = "    Hello Mava  How are you ?";
     String t = trm.trim();
     System.out.println(t);

     //Replace - replaces characters in string
      String s12 = "HELLO HELLO HELLO HELLO";
      String s13=s12.replace("H","h");
      System.out.println(s13);

      //Split
      String p1 = "Hello Mava Ela Unnav ?";
      //split() method breaks a given string around matches
      String p2[] = p1.split("Ela");
        String p3[] = p1.split(" ");

      for(String n:p2){
          System.out.print(n);
      }
      System.out.println(" ");

      for(String n:p3){
          System.out.print(n);
      }

      //Converting numbers to string with valueof
      int num1 = 45;
      String s134 = String.valueOf(num1);
      System.out.println(s134);

      //converting of integer objects to string
      int ik = 99;
      String s345 = Integer.toString(ik);
      System.out.println(s345);

      //CONVERTING TO LOWERCASE,UPPERCASE
       String s38 = "Helloo Mava";
       System.out.println(s38.toLowerCase());
       System.out.println(s38.toUpperCase());

    }
}
