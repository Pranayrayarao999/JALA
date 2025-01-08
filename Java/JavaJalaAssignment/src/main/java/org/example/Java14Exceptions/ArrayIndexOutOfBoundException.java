package org.example.Java14Exceptions;

public class ArrayIndexOutOfBoundException {
    public static void main (String args[]){
        int n1[] = new int[3];
        try{
            for(int i=0;i<4;i++){
                n1[i] += 0;
                System.out.println(n1[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }

    }
}
