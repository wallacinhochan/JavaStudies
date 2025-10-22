package br.com.studiesjava.javacore.polimorfismo.domain;

public class Tv extends Product {
    public static final double IMPOSTO = 0.20;
    public Tv(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculate() {
        return this.price * IMPOSTO;
    }
}
