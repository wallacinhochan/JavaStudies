package br.com.studiesjava.javacore.polimorfismo.service;

import br.com.studiesjava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMem implements Repositorio {
    @Override
    public void save() {
        System.out.println("Salvo com sucesso em memoria");
    }
}
