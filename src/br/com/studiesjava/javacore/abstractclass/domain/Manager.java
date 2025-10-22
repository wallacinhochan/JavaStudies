package br.com.studiesjava.javacore.abstractclass.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary*0.1;
    }

    @Override
    public String toString() {
        return "Devoloper{name = "+name+", salary = "+salary+'}';
    }

    @Override
    public void print() {
        System.out.println("Devoloper{name="+name+", salary="+salary+"}");
    }
}
