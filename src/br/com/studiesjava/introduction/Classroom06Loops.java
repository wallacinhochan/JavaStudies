package br.com.studiesjava.introduction;

public class Classroom06Loops {
    public static void main(String[] args) {
        int cout = 0;
        while (cout <= 10){
            System.out.println("cout: " + cout);
            cout++;
        }

        for (int i = 10; i >= 0; i-- ) {
            System.out.println("i: " + i);
        }
        cout = 0;
        do{
            System.out.println("cout: " + cout);
            cout++;
        }while (cout <= 10);
    }
}
