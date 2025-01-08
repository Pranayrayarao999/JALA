package org.example.Java16Collections;

import java.util.Iterator;

public class ArrayList {
    public static void main(String args[]){
        java.util.ArrayList<String> a1 = new java.util.ArrayList<>();
        a1.add("Raj");
        a1.add("Kishore");
        a1.add("Kamlesh");
        a1.add("Vidya");
        a1.add("Ravi");
        a1.add("Satya");
        a1.add("Amulya");
        a1.add("Ankit");
        a1.add("Pranay");
        a1.add("Zebra Nayak");
        //Middle Element
        System.out.println(a1.get(a1.size()/2) + " ");
        System.out.println(a1);

        //Iterator
        Iterator<String> it = a1.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        //Adding Element at specific index
        a1.add(1,"Rishika");
        a1.add(2,"Likitha");
        System.out.println(a1);
        //Removing Element at specific index
        a1.remove(0);
        System.out.println(a1);
        //Updating Element
        a1.set(0,"Pranu");
        System.out.println(a1);
        //checking the elemenet is present at which index using indexOf()
        System.out.println(a1.indexOf("Pranu"));
        //retriving particular data using get()
        System.out.println(a1.get(0));
        //Finding the size of the list
        System.out.println(a1.size());
        //Checking the element is present inside the Arraylist or no using contains() (boolean value)
        System.out.println(a1.contains("Pranu"));
        System.out.println(a1.contains("Pranuuuu"));
        //Removing all the elements in the list using clear()
        a1.clear();
        System.out.println(a1);
    }
}
