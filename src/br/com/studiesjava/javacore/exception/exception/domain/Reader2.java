package br.com.studiesjava.javacore.exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Reader2 close");
    }
}
