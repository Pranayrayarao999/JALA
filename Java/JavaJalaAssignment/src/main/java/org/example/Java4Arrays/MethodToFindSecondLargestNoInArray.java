package org.example.Java4Arrays;

import java.util.Arrays;

public class MethodToFindSecondLargestNoInArray {
    public static void Second(int z[]){
        int temp;
        for(int a=0;a<z.length;a++){
            for(int b=a+1;b<z.length;b++){
                if(z[a]>z[b]){
                    temp = z[a];
                    z[a] = z[b];
                    z[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(z));
        System.out.println("THE SECOND LARGEST NO IN ARRAY IS :" +z[z.length-2]);
    }

    public static void main (String args[]){
//        int a[] ={11,22,33,44,55,66,77};
        int a[] ={66,77,33,22,55,11,44};
        Second(a);

    }
}
