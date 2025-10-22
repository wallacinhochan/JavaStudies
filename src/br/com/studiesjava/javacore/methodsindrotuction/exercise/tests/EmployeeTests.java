package br.com.studiesjava.javacore.methodsindrotuction.exercise.tests;

import br.com.studiesjava.javacore.methodsindrotuction.exercise.domain.Employee;

public class EmployeeTests {
    public static void main(String[] args) {
        Employee emmployee = new Employee();

        double[] salary = {950.0, 100, 0, 1250.87};

        emmployee.setName("Thalia");
        emmployee.setAge(20);
        emmployee.setSalary(salary);

        emmployee.print();
        emmployee.average();


    }
}
