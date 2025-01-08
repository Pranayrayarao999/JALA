package org.example.Java4Arrays;

import java.util.Scanner;

public class FindElementInSortedArray1To100 {

    public static void Find(int n[], int num1){
        for(int i=0;i<n.length;i++){
            if(num1 == n[i]){
                System.out.println(num1+" NUM IS PRESENT IN ARRAY AT INDEX :"+i);
            }
        }
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO FIND IN ARRAY ??");
        int num1 = sc.nextInt();
        Find(a,num1);
    }
}
