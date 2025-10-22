package br.com.studiesjava.javacore.modifierfinal.domain;

public class Carro {
    private String name;
    public static final double SPEED_LIMIT = 250.0;
    public final Client COMPRADOR = new Client();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getCOMPRADOR() {
        return COMPRADOR;
    }
}
