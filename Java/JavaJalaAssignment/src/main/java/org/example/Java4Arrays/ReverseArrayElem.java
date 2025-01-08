package org.example.Java4Arrays;

import java.util.Arrays;

public class ReverseArrayElem {
    public void reverse(int z[]){
        int k = z.length ;
        int tot[] = new int[k];
        for(int i=0;i<k;i++){
            tot[i]= z[k-1-i];
        }
        System.out.println("REVERSE OF AN ARRAY IS :"+ Arrays.toString(tot));
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        System.out.println("ORIGINAL ARRAY IS :"+Arrays.toString(a));
        ReverseArrayElem ra = new ReverseArrayElem();
        ra.reverse(a);

    }
}
