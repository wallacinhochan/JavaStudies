package br.com.studiesjava.javacore.polimorfismo.service;

import br.com.studiesjava.javacore.polimorfismo.domain.Computador;
import br.com.studiesjava.javacore.polimorfismo.domain.Product;
import br.com.studiesjava.javacore.polimorfismo.domain.Tomato;

public class TributeCalculator {
    public static void calcularImposto(Product product) {
        System.out.println("Relatorio de imposto do " + product.getName());
        double imposto = product.calculate();
        System.out.println("Imposto do product: " + imposto);
        System.out.println("Valor do product: " + product.getPrice());
        System.out.println("Valor final do product: " + (product.getPrice() + imposto));
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getValidade());
        }
    }
}
