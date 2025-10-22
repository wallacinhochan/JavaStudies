package br.com.studiesjava.javacore.methodsindrotuction.tests;

import br.com.studiesjava.javacore.methodsindrotuction.domain.Calculator;

public class CalculatorTests02 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] array = {1,3,5};
        String bars = "========================================";

        calculator.sumArray(array);
        System.out.println(bars);
        calculator.sumVarArgs(array);
        System.out.println(bars);
        calculator.sumVarArgs(1,4,7);
        System.out.println(bars);
    }
}
