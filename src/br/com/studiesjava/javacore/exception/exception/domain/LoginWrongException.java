package br.com.studiesjava.javacore.exception.exception.domain;

public class LoginWrongException extends Exception {
    public LoginWrongException() {
        super("Wrong credentials");
    }

    public LoginWrongException(String message) {
        super(message);
    }
}
