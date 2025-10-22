package br.com.studiesjava.javacore.classintroduction.test;

import br.com.studiesjava.javacore.classintroduction.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new Car();
        cars[0].name = "Carro 1";
        cars[0].year = 2020;
        cars[0].model = "Tesla";

        cars[1] = new Car();
        cars[1].name = "Carro 2";
        cars[1].year = 2021;
        cars[1].model = "Fiat";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].name);
            System.out.println(cars[i].year);
            System.out.println(cars[i].model);
        }
    }
}
