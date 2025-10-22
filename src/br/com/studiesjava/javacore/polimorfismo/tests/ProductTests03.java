package br.com.studiesjava.javacore.polimorfismo.tests;

import br.com.studiesjava.javacore.polimorfismo.domain.Computador;
import br.com.studiesjava.javacore.polimorfismo.domain.Product;
import br.com.studiesjava.javacore.polimorfismo.domain.Tomato;
import br.com.studiesjava.javacore.polimorfismo.service.TributeCalculator;

public class ProductTests03 {
    public static void main(String[] args) {
        Product product = new Computador("Ryzen 7 Rtx6060", 7000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        Tomato product2 = new Tomato("Tomate alemão", 12);
        product2.setValidade("23/10/2025");
        TributeCalculator.calcularImposto(product2);
        System.out.println("-------------------");
        TributeCalculator.calcularImposto(product);
    }
}
