package com.company;

// contoh class abstract
public abstract class SegiEmpat implements BangunDatar {

    protected double panjang;
    protected double lebar;

    @Override
    public abstract void setPanjang(double panjang);
    public double getPanjang() {
        return panjang;
    }

    @Override
    public abstract void setLebar(double lebar);
    public double getLebar() {
        return lebar;
    }

    @Override
    public abstract double getLuas();

}