package br.com.studiesjava.javacore.interfaces.tests;

import br.com.studiesjava.javacore.interfaces.domain.DatabaseLoader;
import br.com.studiesjava.javacore.interfaces.domain.FileLoader;

public class DataLoaderTests {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }
}
