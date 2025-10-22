package br.com.studiesjava.javacore.association.tests;

import java.util.Scanner;

public class DataReading01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String name = input.nextLine();

        System.out.println("Digite sua idade");
        int age = input.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}
