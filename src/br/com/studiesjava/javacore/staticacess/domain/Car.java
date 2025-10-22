package br.com.studiesjava.javacore.staticacess.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(double maxSpeed, String name) {
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public void print() {
        System.out.println("__________________");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + Car.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

}
