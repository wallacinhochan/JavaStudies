package br.com.studiesjava.javacore.exception.exception.tests;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) {
        Exceptiontest01.createnewFile();
    }
    private static void createnewFile(){
        File file = new File("arquivo\\tests.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
