package org.example.Java4Arrays;

import java.util.Scanner;

public class FindIndexOfArrayEle {
    public void FindIndexOfArray(int k[], int num){
        int a=k.length;
        for(int i=0;i<a;i++){
            if(num == k[i]){
                System.out.println(k[i]+"ELEMENT FOUND AT :" +i);
            }
            else{
                System.out.println("ELEMENT NOT FOUND OR EXIST");
            }
        }
    }

    public static void main(String args[]){
        int n[]={1,45,6,2,89,67,33,44,67,2,7,9,0,3};
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO BE SEARCHED IN AN ARRAY ?");
        int num = sc.nextInt();
        FindIndexOfArrayEle fe = new FindIndexOfArrayEle();
        fe.FindIndexOfArray(n,num);
    }
}
