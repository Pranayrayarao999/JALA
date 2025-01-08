package org.example.Java16Collections;

public class HashSet {
    public static void main(String args[]){
        java.util.HashSet<String> s1 = new java.util.HashSet<>();
        s1.add("Raja");
        s1.add("Sathish");
        s1.add("Rajesh");
        s1.add("Pranay");
        s1.add("Niharika");
        s1.add("Sushma");
        s1.add("King");
        s1.add("Akhila");
        s1.add("Anand");
        s1.add("Pushpa");
        s1.add("Pushpa");
        System.out.println(s1);

        //Size() of set
        System.out.println(s1.size());
        //It checks the data present inside or not using contains()
        System.out.println(s1.contains("Pranay"));
        //Checking set is empty or not
        System.out.println(s1.isEmpty());
        //Creating a copy of set
        System.out.println(s1.clone());
        //Removing element inside set
        System.out.println(s1.remove("Pushpa"));
        //Equals checks all are same or not equals()
        System.out.println(s1.equals(s1));
        java.util.HashSet<String> s2 = new java.util.HashSet<>();
        System.out.println(s1.equals(s2));
    }
}
