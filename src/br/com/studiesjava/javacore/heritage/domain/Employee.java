package br.com.studiesjava.javacore.heritage.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void printer(){
        super.printer();
        System.out.println(this.salary);
    }

    public void salaryPrinter(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
