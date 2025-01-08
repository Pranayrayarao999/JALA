package org.example.Java3Loops;

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK EVEN OR NOT ?? ");
        int num = sc.nextInt();
        switch(num%2){
            case 0:
                System.out.println(num+ ": EVEN NUMBER");
                break;
            case 1:
                System.out.println(num+ ": ODD NUMBER");
                break;

        }
    }
}
