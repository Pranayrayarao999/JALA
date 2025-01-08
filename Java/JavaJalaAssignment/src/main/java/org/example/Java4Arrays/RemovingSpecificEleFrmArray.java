package org.example.Java4Arrays;

import java.util.Scanner;

public class RemovingSpecificEleFrmArray {
    public void removeElement(int n[],int a){
        int k = n.length;
        for(int i=0;i<k;i++){
            if(a == n[i]){
                continue;
            }
            System.out.println(n[i]);
        }

    }

    public static void main(String args[]){
        int n[]={11,22,33,44,55,66};
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NO TO REMOVE FROM ARRAY??");
        int num = sc.nextInt();
        RemovingSpecificEleFrmArray rm = new RemovingSpecificEleFrmArray();
        rm.removeElement(n,num);
    }
}
