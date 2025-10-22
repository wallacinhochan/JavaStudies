package br.com.studiesjava.introduction;

public class Classroom04Operators {
    public static void main(String[] args) {
        // + - / *

        int number1 = 10;
        double number2 = 20;
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("Addition is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplication is: " + multiplication);
        System.out.println("Division is: " + division);

        // %
        int number3 = 8;
        int number4 = 3;
        System.out.println(number3%number4);

        // < > <= >= !=
        boolean isTenMoreToTheere = number1 > number3;
        System.out.println(isTenMoreToTheere);
    }
}
