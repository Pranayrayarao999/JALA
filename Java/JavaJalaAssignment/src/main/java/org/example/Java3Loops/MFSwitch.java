package org.example.Java3Loops;

import java.util.Scanner;

public class MFSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE GENDER MALE/FEMALE ?");
        String gender = sc.next();

        switch (gender){
            case "MALE":
                System.out.println("MALE");
                break;

            case "FEMALE":
                System.out.println("FEMALE");
                break;

            default:
                System.out.println("WRONG INPUT....TRY AGAIN");
                break;
        }
    }
}
