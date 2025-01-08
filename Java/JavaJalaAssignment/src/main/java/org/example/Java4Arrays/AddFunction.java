package org.example.Java4Arrays;

public class AddFunction {
    public static int Add(int n[]){
        int k = n.length;
        int sum =0;
        for(int i=0;i<k;i++){
            sum =sum + n[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]){
        int n[] = {10,20,30,40,50};
        Add(n);
    }
}
