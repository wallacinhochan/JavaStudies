package br.com.studiesjava.javacore.exception.exception.tests;

import br.com.studiesjava.javacore.exception.exception.domain.Reader1;
import br.com.studiesjava.javacore.exception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTests01 {
    public static void main(String[] args) {

    }

    private static void readFile() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"))
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
