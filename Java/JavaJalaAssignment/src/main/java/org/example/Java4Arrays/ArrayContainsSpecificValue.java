package org.example.Java4Arrays;

import java.util.Scanner;

public class ArrayContainsSpecificValue {
    public boolean SpecificValue(int a[], int num){
        int k = a.length;
        for(int i=0;i<k;i++){
            if(num == a[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int a[] = {11,22,33,44,55};
        System.out.println("ENTER THE VALUE TO BE SEARCHED ?? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayContainsSpecificValue as = new ArrayContainsSpecificValue();
        boolean result =  as.SpecificValue(a,n);
        if(result){
            System.out.println("NUMBER FOUND");
        }
        else{
            System.out.println("NUMBER NOT FOUND");
        }
    }
}
