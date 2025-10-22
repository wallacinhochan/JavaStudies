package br.com.studiesjava.javacore.methodsindrotuction.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }
    public void subTwoNumbers() {
        System.out.println(21 - 10);
    }
    public void sumArray(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        System.out.println(sum);
    }
    public void sumVarArgs(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
