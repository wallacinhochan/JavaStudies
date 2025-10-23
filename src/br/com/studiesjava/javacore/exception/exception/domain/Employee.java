package br.com.studiesjava.javacore.exception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {
    public void save() throws ArrayIndexOutOfBoundsException {
        System.out.println("Save employee!");
    }
}
