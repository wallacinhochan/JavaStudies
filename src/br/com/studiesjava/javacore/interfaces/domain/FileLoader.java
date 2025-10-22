package br.com.studiesjava.javacore.interfaces.domain;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Data base loading file...");
    }

    @Override
    public void remove() {
        System.out.println("Data base removing file...");
    }

    @Override
    public void check() {
        System.out.println("Data base checking file...");
    }
}
