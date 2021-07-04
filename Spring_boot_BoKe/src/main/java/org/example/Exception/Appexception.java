package org.example.Exception;

public class Appexception extends RuntimeException {
    public Appexception(String message) {
        super(message);
    }

    public Appexception(String message, Throwable cause) {
        super(message, cause);
    }
}
