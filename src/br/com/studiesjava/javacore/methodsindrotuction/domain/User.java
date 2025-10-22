package br.com.studiesjava.javacore.methodsindrotuction.domain;

public class User {
    private String name;
    private int age;
    private char gender;


    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }
}
