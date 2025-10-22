package br.com.studiesjava.javacore.exception.runtime.tests;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // error
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Finalizando operação!");
        }
    }
}
