package org.example.Java4Arrays;

import java.util.Arrays;
//12
public class Method2RemoveDuplicteEleArray {
    public void RemoveElement(int z[]){
        int t[] = new int[z.length];

        for(int i=0;i<z.length-1;i++){
            if(z[i] == z[i+1]){
                continue;
            }
        }
        System.out.println("AFTER REMOVING DUPLICATE FRM ARRAY : "+ Arrays.toString(z));
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5,5,6};
        Method2RemoveDuplicteEleArray md = new Method2RemoveDuplicteEleArray();
        md.RemoveElement(a);
    }
}
