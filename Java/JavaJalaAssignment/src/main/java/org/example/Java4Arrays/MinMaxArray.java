package org.example.Java4Arrays;

public class MinMaxArray {
    public void max(int z[]){
        int max = z[0];
        for(int i=1;i<z.length;i++){
            if(z[i] > max){
                max = z[i];
            }
        }
        System.out.println("MAXIMUM NO IN ARRAY IS :" +max);
    }
    public void min(int y[]){
        int min = y[0];
        for(int i=1;i<y.length;i++){
            if(y[i]< min){
                min = y[i];
            }
        }
        System.out.println("MINIMUM NO IN ARRAY IS :" +min);
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7};
        MinMaxArray mm = new MinMaxArray();
        mm.max(a);
        mm.min(a);
    }
}
