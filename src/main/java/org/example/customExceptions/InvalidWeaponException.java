package org.example.customExceptions;

public class InvalidWeaponException extends Exception {

    public InvalidWeaponException(String message){
        super(message);
    };
}
