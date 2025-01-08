package org.example.Java4Arrays;

public class FindDuplicatesInArray {
    public void Duplicate(int t[]){
        int count =0;
        for(int i=0;i<t.length - 1;i++){
            if(t[i] ==t[i+1]){
                count++;
                System.out.println("DUPLICATE ELEMENT IS :" +t[i]);
            }
        }
        System.out.println("COUNT OF DUPLICATE ELEMENTS IN ARRAY IS :" +count);
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,4,5,6};
        FindDuplicatesInArray fd = new FindDuplicatesInArray();
        fd.Duplicate(a);
    }
}
