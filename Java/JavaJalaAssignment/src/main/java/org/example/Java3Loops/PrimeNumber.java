package org.example.Java3Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK IT IS PRIME NUMBER OR NOT ?");
        int num1 = sc.nextInt();
        boolean result = true;

        if(num1==1){
            System.out.println(num1+ ": IS PRIME NUMBER");
        }
        else if(num1 > 0){
            for(int i=2;i<num1;i++){
                if( num1%i == 0){
                    result = false;
                    break;
                }
            }
        }

        if(result){
            System.out.println(num1+ ": IS PRIME NUMBER");
        }
        else{
            System.out.println(num1+ ": IS NOT PRIME NUMBER");
        }

    }
}
