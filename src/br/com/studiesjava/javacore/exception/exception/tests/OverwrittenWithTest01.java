package br.com.studiesjava.javacore.exception.exception.tests;

import br.com.studiesjava.javacore.exception.exception.domain.Employee;
import br.com.studiesjava.javacore.exception.exception.domain.LoginWrongException;
import br.com.studiesjava.javacore.exception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverwrittenWithTest01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Employee e1 = new Employee();

        try {
            p1.save();
        } catch (LoginWrongException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            e1.save();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
