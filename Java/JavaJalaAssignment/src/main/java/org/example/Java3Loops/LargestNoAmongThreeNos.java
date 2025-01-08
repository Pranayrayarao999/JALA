package org.example.Java3Loops;

public class LargestNoAmongThreeNos {
    public static void main(String args[]){
        int n = 11;
        int o = 12;
        int p = 13;

        if(n > o){
            System.out.println(n+": IS THE GREATEST NO");
        }
        else if(o > p){
            System.out.println(o+ ": IS THE GREATEST NO");
        }
        else if(p > n){
            System.out.println(p+ ": IS THE GREATEST NO");
        }
        else{
            System.out.println("ALL NO ARE EQUAL");
        }
    }
}
