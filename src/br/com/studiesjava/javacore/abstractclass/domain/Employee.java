package br.com.studiesjava.javacore.abstractclass.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonus();
    }


    public abstract void bonus();

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

}
