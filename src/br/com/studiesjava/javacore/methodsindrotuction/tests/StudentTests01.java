package br.com.studiesjava.javacore.methodsindrotuction.tests;

import br.com.studiesjava.javacore.methodsindrotuction.domain.Printer;
import br.com.studiesjava.javacore.methodsindrotuction.domain.Student;

public class StudentTests01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Printer printer = new Printer();

        student1.name = "Thalia";
        student1.age = 19;
        student1.gender = 'F';

        student2.name = "Peter Pan";
        student2.age = 25;
        student2.gender = 'M';

        printer.print(student1);
        printer.print(student2);



    }
}
