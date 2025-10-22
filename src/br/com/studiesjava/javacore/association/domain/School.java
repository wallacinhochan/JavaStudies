package br.com.studiesjava.javacore.association.domain;

public class School {
    private String name;
    private Teacher[] teacher;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Teacher[] teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void print() {
        System.out.println(this.name);
        if (this.teacher != null) {
            for (Teacher teacher : this.teacher) {
                System.out.println(teacher.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }
}
