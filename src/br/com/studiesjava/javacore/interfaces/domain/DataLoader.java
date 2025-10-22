package br.com.studiesjava.javacore.interfaces.domain;

public interface DataLoader {
    public abstract void load();
    default void check(){
        System.out.println("Data base checking...");
    }
}
