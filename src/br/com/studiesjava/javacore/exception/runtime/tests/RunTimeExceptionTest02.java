package br.com.studiesjava.javacore.exception.runtime.tests;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(RunTimeExceptionTest02.division(1, 0));
    }


    private static int division(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Division by zero");
        }
        return a/b;
    }
}
