package br.com.studiesjava.javacore.association.exercise.tests;

import br.com.studiesjava.javacore.association.exercise.domain.Location;
import br.com.studiesjava.javacore.association.exercise.domain.Seminar;
import br.com.studiesjava.javacore.association.exercise.domain.Students;
import br.com.studiesjava.javacore.association.exercise.domain.Teacher;

public class Main {
    public static void main(String[] args) {
        Location location = new Location("Centro de Educação");
        Teacher teacher = new Teacher("Mauro", "Pedagogia");
        Students student01 = new Students("Thalia", 20);
        Students student02 = new Students("Wallace", 20);
        Students[] students = {student01, student02};
        Seminar seminar = new Seminar("Ensino Culposo", location);
        seminar.setStudents(students);
        Seminar[] seminars = {seminar};
        teacher.setSeminar(seminars);

        teacher.printer();

    }
}
