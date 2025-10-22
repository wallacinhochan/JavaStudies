package br.com.studiesjava.javacore.polimorfismo.tests;

import br.com.studiesjava.javacore.polimorfismo.domain.Computador;
import br.com.studiesjava.javacore.polimorfismo.domain.Tomato;
import br.com.studiesjava.javacore.polimorfismo.domain.Tv;
import br.com.studiesjava.javacore.polimorfismo.service.TributeCalculator;

public class ProductTests {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro v15", 4700.0);
        Tomato tomato = new Tomato("Tomate cereija", 12.56);
        Tv television = new Tv("Television 50\"", 4500);

        TributeCalculator.calcularImposto(computador);
        System.out.println("----------------------------------");
        TributeCalculator.calcularImposto(tomato);
        System.out.println("----------------------------------");
        TributeCalculator.calcularImposto(television);
    }
}
