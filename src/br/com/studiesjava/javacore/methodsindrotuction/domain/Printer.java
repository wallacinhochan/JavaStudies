package br.com.studiesjava.javacore.methodsindrotuction.domain;

public class Printer {
    public void print(Student student){
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
