package org.example.Java1Basic;

public class FunctionPrintYourName {
    public void CallFunction(String name){
        System.out.println("NAME IS:"+name);
    }

    public static void main(String args[]){
        FunctionPrintYourName fpr = new FunctionPrintYourName();
        fpr.CallFunction("Raju");
    }
}
