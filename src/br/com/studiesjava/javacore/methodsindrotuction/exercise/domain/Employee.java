package br.com.studiesjava.javacore.methodsindrotuction.exercise.domain;

public class Employee {

    private String name;
    private int age;
    private double[] salary = new double[2];
    protected double avarege;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary[0] + " " + this.salary[1] + " " + this.salary[2]);
        System.out.println(this.avarege);
    }

    public void average() {
        double sum = 0;
        for (double i : this.salary) {
            sum += i;
        }
        double avaregeResult = (sum / 3);
        System.out.println(avaregeResult);
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

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAvarege() {
        return avarege;
    }

}
