package br.com.studiesjava.javacore.exception.exception.tests;

import java.io.File;
import java.io.IOException;

public class Exceptiontest02 {
    public static void main(String[] args) {
        try {
            Exceptiontest02.createnewFile();
        }catch(IOException e) {
            System.out.println("dentro do catch da main");
            e.getMessage();
        }
    }
    private static void createnewFile() throws IOException{
        File file = new File("arquivo\\tests.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

}
