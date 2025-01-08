package org.example.Java4Arrays;

import java.util.Scanner;

public class ArrayContainsTwoSpecifiedElements {
    public static void Specific(int a,int b,int w[]){
        boolean num1 = false;
        boolean num2 = false;
        for(int i=0;i<w.length;i++){
            if(a == w[i]){
                num1 = true;
                //System.out.println(+a+ " NUMBER PRESENT INSIDE:" +w[i] );
            }
            else if(b == w[i]){
                num2 = true;
                //System.out.println(+b+ " NUMBER PRESENT INSIDE:" +w[i]);
            }
            else{
                //System.out.println("BOTH NUMBERS ARE NOT PRESENT IN ARRY");
            }
        }

        if(num1){
            System.out.println(+a+ " NUMBER PRESENT INSIDE ARRAY" );
        }
        else if(num2){
            System.out.println(+b+ " NUMBER PRESENT INSIDE ARRAY");
        }
        else if(num1 && num2) {
            System.out.println("BOTH NUMBERS ARE PRESENT IN ARRY");
        }
        else{
            System.out.println("BOTH NUMBERS ARE NOT PRESENT IN ARRY");
        }
    }

    public static void main(String args[]){
        int w[] = {1,2,3,4,5,6,7,8,9,100,11,22,33,44,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST ELEMENT TO CHECK IT IN ARRAY ?");
        int y = sc.nextInt();
        System.out.println("ENTER THE SECOND ELEMENT TO CHECK IT IN ARRAY ?");
        int z = sc.nextInt();
        Specific(y,z,w);
    }
}
