package br.com.studiesjava.javacore.association.exercise.domain;

public class Teacher {
    private String name;
    private String specialism;
    private Seminar[] seminar;

    public Teacher(String name, String specialism) {
        this.name = name;
        this.specialism = specialism;
    }

    public void printer() {
        System.out.println("Name: " + name);
        System.out.println("Specialism: " + specialism);
        if (seminar == null) return;
        for (Seminar seminar : seminar) {
            System.out.println("Seminar: " + seminar.getTitle());
            System.out.println("Seminar Location: " + seminar.getLocation().getAddress());
            System.out.println("Students of seminar: ");
            for (Students student : seminar.getStudents()) {
                if (student != null) {
                    System.out.println(student.getName() + ".");
                }
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    public Seminar[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminar = seminar;
    }
}
