package br.com.studiesjava.javacore.polimorfismo.domain;

public class Computador extends Product {
    public static final double IMPOSTO = 0.20;

    public Computador(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculate() {
        return this.price * IMPOSTO;
    }

}
