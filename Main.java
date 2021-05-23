package com.company;

public class Main {

    public static void main(String[] args) {
        Kotak persegi_panjang = new Kotak();
        persegi_panjang.setPanjang(4);
        persegi_panjang.setLebar(5);
        Balok b = new Balok(2, 3, 4);

        System.out.println("=============Hasil Hitungan============");
        System.out.println("Luas Persegi Panjang    : " + persegi_panjang.getLuas());
        System.out.println("Luas Balok              : " + b.getLuas());
        System.out.println("Volume Balok            : " + b.getVolume());
    }

}

