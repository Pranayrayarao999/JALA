package org.example.Java14Exceptions;

public class WriteMethodWhichThrowsException {

    static void throwException() {
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}
