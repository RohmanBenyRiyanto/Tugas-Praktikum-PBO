/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbo.modul4;


public class CommisionEmployee extends Employee {
    public String nama;
    private int nip;
    private float totalGaji;
    private float gajiPokok;
    private float komisi;
    private float totalPenjualan;

    public CommisionEmployee(String nama, int nip, float gajiPokok, float komisi, float totalPenjualan) {
        super("Commision Employe");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    protected float menghitungGaji() {
        totalGaji = gajiPokok + (komisi * totalPenjualan);
        return totalGaji;
    }

    @Override
    protected String cetakData() {
        System.out.print("\n--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        System.out.print("\n|\t\tJenis\t\t | \t\tNama\t\t | \t\tNIP\t\t | \t\tUpah Mingguan\t\t | \t\tGaji Pokok\t\t | \t\tTotal Gaji\t\t |" +
                "\t\tKomisi\t\t | \t\tTotal Proyek\t\t | \t\tTotal Penjualan\t\t | \n");
        System.out.print("--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        System.out.print("\n2. " + employee + " |");
        System.out.print("\t\t"+ nama);
        System.out.print("\t\t | ");
        System.out.print("   "+ nip);
        System.out.print("\t | ");
        System.out.print("\t\t\t  -\t\t\t\t |");
        System.out.print("\t\t"+ gajiPokok);
        System.out.print("\t\t | ");
        System.out.print("\t\t\t-\t\t\t |");
        System.out.print("\t\t "+ komisi);
        System.out.print("\t\t | ");
        System.out.print("\t\t\t   -\t\t\t | ");
        System.out.print("\t\t\t "+ totalPenjualan);
        System.out.print("\t\t\t | ");
        System.out.print("\n--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        return super.toString()+
                " yang bernama " + nama +
                " dengan NIP " + nip +
                " mendapatkan komisi Rp " + komisi +
                " dengan \n   Gaji Pokok sebesar Rp." + gajiPokok +
                ", dan total proyek sebanyak" + totalPenjualan +
                ", sehingga " + nama +
                " mendapatkan Total Gaji Rp." +
                this.menghitungGaji();
    }
}
