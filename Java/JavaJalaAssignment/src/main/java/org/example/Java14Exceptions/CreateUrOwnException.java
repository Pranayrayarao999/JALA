package org.example.Java14Exceptions;

public class CreateUrOwnException {

    public static void exam(int marks) throws OwnException{
        if(marks < 80){
            throw new OwnException("FAILED IN EXAM");
        }
        else {
            System.out.println("PASSED IN EXAM");
        }
    }
    public static void main(String args[]) {
        try{
            exam(79);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
