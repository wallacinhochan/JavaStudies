package br.com.studiesjava.javacore.heritage.domain;

public class Person {
    protected String name;
    protected int age;
    protected String cpf;
    protected Address address;

    public Person(String name) {
        this.name = name;
    }

    public void printer(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CPF: " + this.cpf);
        this.address.printer();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
