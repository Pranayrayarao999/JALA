package org.example.Java4Arrays;

import java.util.Arrays;

public class CopyAnArray2AnotherArr {
    public void ArrayAnother(int a[]){
        int k = a.length;
        int z[]=a;
        System.out.println("AFTER COPYING:"+Arrays.toString(z));
    }

    public static void main(String args[]){
        int n[] = {11,22,33,44,55,66};
        CopyAnArray2AnotherArr ca = new CopyAnArray2AnotherArr();
        ca.ArrayAnother(n);
    }
}
