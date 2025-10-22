package br.com.studiesjava.javacore.association.exercise.domain;

public class Seminar {

    private String title;
    private Students[] students = new Students[10];
    private Location location;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        if (students.length <= 10 && students.length > 0) {
            int i = 0;
            for (Students student : students) {
                if (student.getSeminar() == null) {
                    this.students[i] = student;
                    System.out.println("Estudante " + student.getName() + " adcionado com sucesso ao seminario " + this.title + " .");
                    i += 1;
                } else {
                    System.out.println("Esse estudante já está em um seminario");
                }
            }
        } else {
            if (students.length > 10) {
                System.out.println("Capacidade maxima ultrapassada.");
            } else {
                System.out.println("Capacidade minima ultrapassada.");
            }
        }


    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
