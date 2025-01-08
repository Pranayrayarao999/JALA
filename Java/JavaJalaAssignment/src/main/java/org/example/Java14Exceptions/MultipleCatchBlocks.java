package org.example.Java14Exceptions;

public class MultipleCatchBlocks {
    public static void main(String args[]){
        try{
            //ArrayIndexOutOfBoundsException
            int arr[] = new int[3];
            for(int i=0;i<=4;i++){
                System.out.println(arr[i]);
            }

            //Arithmetic Exception
            arr[3] = 10/0;
        }
        catch(ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }
        catch(java.lang.ArithmeticException ae){
            ae.printStackTrace();
        }
    }

}
