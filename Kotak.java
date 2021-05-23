package com.company;

// contoh class meng-extends abstract class
public final class Kotak extends SegiEmpat {

    public Kotak() {
        setPanjang(1);
        setLebar(1);
    }
    public Kotak(double panjang, double lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }

    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar < 0 ? 1 : lebar;
    }
    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang < 0 ? 1 : panjang;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

}

