package br.com.studiesjava.javacore.methodsindrotuction.tests;

import br.com.studiesjava.javacore.methodsindrotuction.domain.User;

public class UserTests {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Wallace");
        user.setAge(12);
        user.setGender('M');

        user.print();

        System.out.println(user.getName());


    }
}
