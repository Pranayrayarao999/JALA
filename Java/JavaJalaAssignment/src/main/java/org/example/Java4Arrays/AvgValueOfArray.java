package org.example.Java4Arrays;

public class AvgValueOfArray {
    public void AvgValue(int n[]){
        int a = n.length;
        int sum =0;
        for(int i=0;i<a;i++){
            sum = sum + n[i];
        }
        int avg = sum/a;
        System.out.println("THE AVG VALUES OF ARRAY ON INTEGERS IS :" +avg);
    }

    public static void main(String args[]){
        int k[] = {1,2,3,4,5};
        AvgValueOfArray av =new AvgValueOfArray();
        av.AvgValue(k);
    }
}
