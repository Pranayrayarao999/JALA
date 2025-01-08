package org.example.Java3Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER TO CHECK IT IS EVEN OR ODD??");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num+": IS EVEN NUMBER");
        }
        else{
            System.out.println(num+ ": IS ODD NUMBER");
        }
    }
}
