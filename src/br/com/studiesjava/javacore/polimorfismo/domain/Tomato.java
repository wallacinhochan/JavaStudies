package br.com.studiesjava.javacore.polimorfismo.domain;

public class Tomato extends Product {
    public static final double IMPOSTO = 0.05;
    private String validade;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculate() {
        return this.price * IMPOSTO;
    }
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
}
