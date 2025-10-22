package br.com.studiesjava.javacore.classintroduction.test;

import br.com.studiesjava.javacore.classintroduction.domain.User;

public class UserTest01 {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Thalia";
        user.gender = 'F';
        user.age = 20;

        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.gender);
    }
}
