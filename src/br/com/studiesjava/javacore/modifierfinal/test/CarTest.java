package br.com.studiesjava.javacore.modifierfinal.test;

import br.com.studiesjava.javacore.modifierfinal.domain.Carro;

public class CarTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.SPEED_LIMIT);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setName("Chan");
        System.out.println(carro.COMPRADOR);
    }
}
