package org.example.Java3Loops;

import java.util.Scanner;

public class ArmstrongNumber {

    public void IsArmstrong(int n){
        int result =0;
        int temp = n;

        while(n !=0){
            int sum = n%10;
            /* LOGIC : power of r for each individual and add those numbers */
            result += (sum * sum * sum);
            n = n/10;
        }
        if(temp == result){
            System.out.println(temp+ ": IS ARMSTRONG NUMBER");
        }
        else{
            System.out.println(temp+ ": IS NOT ARMSTRONG NUMBER");
        }
    }

    public static void main(String args[]){
        ArmstrongNumber an = new ArmstrongNumber();
        System.out.println("ENTER THE NUMBER TO CHECK ARMSTRONG OR NOT???");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        an.IsArmstrong(num);
    }
}
