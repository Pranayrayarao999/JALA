package org.example.Java3Loops;

public class MultipleIfElse {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+ ": IS GREATEST");
            }
            else{
                System.out.println(num3+": IS GREATEST");
            }
        }
        else if(num2 > num3){
            System.out.println(num2+": IS GREATEST");
        }
        else{
            System.out.println(num3+ ": IS GREATEST");
        }
    }
}
