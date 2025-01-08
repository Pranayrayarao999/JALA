package org.example.Java4Arrays;

public class MethodToFindEvenOrOddInArray {
    public static void Even(int z[]){
        for(int i=0;i<z.length;i++){
            if(z[i]%2 == 0){
                System.out.println("EVEN NUMBERS ARE :"+z[i]);
            }
        }
    }

    public static void Odd(int y[]){
        for(int j=0;j<y.length;j++){
            if(y[j]%2 != 0){
                System.out.println("ODD NUMBERS ARE :"+y[j]);
            }
        }
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Even(a);
        System.out.println("*****************************");
        Odd(a);
    }
}
