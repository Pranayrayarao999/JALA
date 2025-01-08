package org.example.Java4Arrays;

public class DifferenceOfLargestAndSmallestValueInArray {
    public static void Difference(int a[]){
        int difference = a[a.length - 1] - a[0];
        System.out.println("THE DIFFERENCE OF LARGEST AND SMALLEST VALUE IS :"+difference);
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        Difference(a);
    }
}
