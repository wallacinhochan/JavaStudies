package br.com.studiesjava.javacore.methodsindrotuction.tests;

import br.com.studiesjava.javacore.methodsindrotuction.domain.Student;

public class StudentTests02 {

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "John";
        student.age = 25;
        student.gender = 'M';

        student.print();

    }

}
