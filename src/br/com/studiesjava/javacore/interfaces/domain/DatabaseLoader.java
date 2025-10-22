package br.com.studiesjava.javacore.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Data base loading...");
    }

    @Override
    public void remove() {
        System.out.println("Data base removing...");
    }
}
