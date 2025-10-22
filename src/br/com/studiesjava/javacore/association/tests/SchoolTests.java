package br.com.studiesjava.javacore.association.tests;

import br.com.studiesjava.javacore.association.domain.School;
import br.com.studiesjava.javacore.association.domain.Teacher;

public class SchoolTests {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Thalia Gatinha");
        Teacher teacher2 = new Teacher("Jiraya");
        Teacher[] teachers = {teacher, teacher2};
        School school = new School("Agape", teachers);

        school.print();

    }
}
