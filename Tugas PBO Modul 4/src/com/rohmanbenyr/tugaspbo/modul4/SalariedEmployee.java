/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbo.modul4;

public class SalariedEmployee extends Employee {
    private String nama;
    private int nip;
    private float gaji;
    private float upahMingguan;

    public SalariedEmployee(String nama, int nip, float upahMingguan) {
        super("Salaried Employee ");
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    @Override
    protected float menghitungGaji(){
        gaji = upahMingguan;
        return gaji;
    }

    @Override
    public String cetakData() {
        System.out.print("--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        System.out.print("\n|\t\tJenis\t\t | \t\tNama\t\t | \t\tNIP\t\t | \t\tUpah Mingguan\t\t | \t\tGaji Pokok\t\t | \t\tTotal Gaji\t\t |" +
                "\t\tKomisi\t\t | \t\tTotal Proyek\t\t | \t\tTotal Penjualan\t\t | \n");
        System.out.print("--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        System.out.print("\n1. " + employee);
        System.out.print("|\t   "+ nama);
        System.out.print("\t\t | ");
        System.out.print("   "+ nip);
        System.out.print("\t | ");
        System.out.print("\t\t   "+ upahMingguan);
        System.out.print("\t\t\t | ");
        System.out.print("\t\t\t-\t\t\t | ");
        System.out.print("\t   Rp. "+ this.menghitungGaji() );
        System.out.print("\t\t | ");
        System.out.print("\t\t   -\t\t | ");
        System.out.print("\t\t\t   -\t\t\t | ");
        System.out.print("\t\t\t\t-\t\t\t | ");
        System.out.print("\n--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        return super.toString() + "yang bernama " + nama + " dengan NIP " + nip + " memiliki total gaji Rp." + this.menghitungGaji();
    }

}
