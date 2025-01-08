package org.example.Java4Arrays;

import java.util.Arrays;

public class CommonEleIn2Arrays {
    public void Common(int a[],int b[]){
        int common = 0;
        int t[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                //System.out.print(a[i]+ " " +b[j]);
                if(a[i] == b[j]){
                    common +=1;
                    t[i]=b[j];
                    System.out.println("COMMON ELEMENT IN BOTH ARRAYS IS :" +a[i]);
                }
            }
//            System.out.println("COMMON ELEMENTS IN BOTH ARRAYS IS :"+ Arrays.toString(t));
        }
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int b[] ={5,6,7,8,9,0};
        CommonEleIn2Arrays ce = new CommonEleIn2Arrays();
        ce.Common(a,b);
    }
}
