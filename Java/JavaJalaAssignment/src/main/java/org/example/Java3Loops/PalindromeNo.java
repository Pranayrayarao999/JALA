package org.example.Java3Loops;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK PALINDROME OR NOT ?? ");
        int num1 = sc.nextInt();
        int sum= 0;
        int temp = num1;

        while(num1 !=0){
            sum = sum * 10 + num1%10;
            num1 = num1/10;
        }

        if(temp == sum){
            System.out.println(sum+ ": IS PALINDROME NUMBER");
        }
        else{
            System.out.println(sum+ ": IS NOT PALINDROME NUMBER");
        }
    }
}
