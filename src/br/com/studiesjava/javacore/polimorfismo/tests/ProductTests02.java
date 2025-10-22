package br.com.studiesjava.javacore.polimorfismo.tests;

import br.com.studiesjava.javacore.polimorfismo.domain.Computador;
import br.com.studiesjava.javacore.polimorfismo.domain.Product;
import br.com.studiesjava.javacore.polimorfismo.service.TributeCalculator;

import javax.sound.midi.Soundbank;

public class ProductTests02 {
    public static void main(String[] args) {
        Product product = new Computador("Ryzen 7 Rtx6060", 7000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
