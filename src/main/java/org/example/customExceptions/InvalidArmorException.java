package org.example.customExceptions;

public class InvalidArmorException extends Exception{

    public InvalidArmorException(String message){
        super(message);
    }
}
