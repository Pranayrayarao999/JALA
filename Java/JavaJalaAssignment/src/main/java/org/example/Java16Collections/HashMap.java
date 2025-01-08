package org.example.Java16Collections;

public class HashMap {
    public static void main(String args[]){
        java.util.HashMap< Integer,String> a1 = new java.util.HashMap<Integer, String>();

        //Inserting the data inside using put
        a1.put(0,"Raja");
        a1.put(1,"Satya");
        a1.put(2,"Ramesh");
        a1.put(3,"Jagan");
        a1.put(4,"Anand");
        a1.put(5,"Dinesh");
        a1.put(6,"Pranay");
        a1.put(7,"Ramesh");
        a1.put(8,"Akhila");
        a1.put(9,"Niharika");
        System.out.print(a1);
        System.out.println(" ");

        //Retrieving the particular data by using the key to get() data
        System.out.println(a1.get(4));
        //Creating a Copy of HashMap data using clone()
        System.out.println(a1.clone());
        //Checking the key is present inside the hashmap data using containsKey() (boolean values)
        System.out.println(a1.containsKey(4));
        System.out.println(a1.containsKey(100));
        //Checking the value is present inside the hashmap data using containsValue()
        System.out.println(a1.containsValue("Pranay"));
        System.out.println(a1.containsValue("Pranuu"));
        //Checking the Hashmap data is empty or not using isEmpty() (Boolean Value)
        System.out.println(a1.isEmpty());
        //Checking the size of HashMap data
        System.out.println(a1.size());
        //Printing all the keys of hashmap using keySet()
        System.out.println(a1.keySet());
        //Removing the data inside hashmap using remove()
        System.out.println(a1.remove(0));
        System.out.println(a1.remove(1,"Satya"));
        //System.out.println(a1);

        //Copying all elements of Map to another Map
        java.util.HashMap<Integer,String> a2 = new java.util.HashMap<>();
        a2.putAll(a1);
        System.out.println(a2);


    }
}
