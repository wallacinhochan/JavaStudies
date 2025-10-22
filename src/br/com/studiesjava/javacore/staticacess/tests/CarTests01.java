package br.com.studiesjava.javacore.staticacess.tests;

import br.com.studiesjava.javacore.staticacess.domain.Car;

public class CarTests01 {
    public static void main(String[] args) {
        Car car1 = new Car(255, "BMW");
        Car car2 = new Car(232, "FIAT");
        Car car3 = new Car(240, "TESLA");

        Car.setSpeedLimit(320);

        car1.print();
        car2.print();
        car3.print();
    }
}
