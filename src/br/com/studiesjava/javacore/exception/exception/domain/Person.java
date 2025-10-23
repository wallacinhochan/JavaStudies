package br.com.studiesjava.javacore.exception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws LoginWrongException, FileNotFoundException {
        System.out.println("Save person!");
    }
}
