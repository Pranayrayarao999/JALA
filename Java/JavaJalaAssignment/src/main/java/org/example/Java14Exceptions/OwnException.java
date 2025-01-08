package org.example.Java14Exceptions;

import java.io.InvalidClassException;

public class OwnException extends Exception{
    OwnException(String msg){
        System.out.println(msg);
    }
}
