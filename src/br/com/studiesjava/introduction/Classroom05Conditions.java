package br.com.studiesjava.introduction;

public class Classroom05Conditions {
    public static void main(String[] args) {
        int payment = 6000;
        if (payment > 5000){
            System.out.println("Eu posso comprar isso!");
        }else if (payment < 5000){
            System.out.println("Eu não posso comprar isso!");
        }else {
            System.out.println("Eu tenho o dinheiro exato para comprar!");
        }
        String result = payment > 5000 ? "Eu posso comprar isso!" : "Eu não posso comprar isso!";
        System.out.println(result);

        int day = 10;
        switch (day){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }
    }
}
