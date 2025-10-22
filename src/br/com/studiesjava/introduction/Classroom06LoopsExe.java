package br.com.studiesjava.introduction;

public class Classroom06LoopsExe {
    public static void main(String[] args) {
        int priceCar = 32080;
        int parcel = 100;
        do{
            int parcels = priceCar/parcel;
            System.out.println("São "+parcels+" parcel(s) de "+ parcel+ " reais.");
            parcel+=100;
        }while(parcel <= 1000);
    }
}
