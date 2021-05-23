package com.company;

// contoh class meng-implement 2 interface
public final class Balok implements BangunDatar, BangunRuang {

    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok() {
        setPanjang(1);
        setLebar(1);
        setTinggi(1);
    }
    public Balok(double panjang, double lebar, double tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }

    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang < 0 ? 1 : panjang;
    }
    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar < 0 ? 1 : lebar;
    }
    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi < 0 ? 1 : tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    @Override
    public double getVolume() {
        return panjang * lebar * tinggi;
    }

}

