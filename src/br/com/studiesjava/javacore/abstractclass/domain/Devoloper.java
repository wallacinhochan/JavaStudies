package br.com.studiesjava.javacore.abstractclass.domain;

public class Devoloper extends Employee{
    public Devoloper(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Devoloper{name = "+name+", salary = "+salary+'}';
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary*0.05;
    }

    @Override
    public void print() {
        System.out.println("Devoloper{name="+name+", salary="+salary+"}"  );
    }
}
