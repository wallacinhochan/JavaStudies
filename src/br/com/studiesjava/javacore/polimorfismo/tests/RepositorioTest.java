package br.com.studiesjava.javacore.polimorfismo.tests;

import br.com.studiesjava.javacore.polimorfismo.repositorio.Repositorio;
import br.com.studiesjava.javacore.polimorfismo.service.RepositorioBD;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBD();

        repositorio.save();

    }
}
