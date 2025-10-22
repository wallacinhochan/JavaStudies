package br.com.studiesjava.introduction;

public class Classroom07Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];

        idades[0] = 3;
        idades[1] = 34;
        idades[2] = 67;

        for (int j = 0; j < 3; j++) {
            System.out.println(idades[j]);
        }
        int[] numbers = {1, 2, 4, 5, 6, 7, 8, 9, 100};
        System.out.println("-----------------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------------------------");

        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                System.out.println(matriz[j][k]);
            }
        }
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];
    }


}
