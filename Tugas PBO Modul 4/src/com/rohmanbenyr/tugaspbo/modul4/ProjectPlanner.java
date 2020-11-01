/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbo.modul4;

public class ProjectPlanner extends Employee {
    public String nama;
    private int nip;
    private float gajiPokok;
    private float komisi;
    private float totalProyek;

    public ProjectPlanner(String nama, int nip, float gajiPokok, float komisi, float totalProyek) {
        super("Projek Planner");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalProyek = totalProyek;
    }

    @Override
    protected float menghitungGaji() {
        float pajak = (5/100) * gajiPokok;
        float totalGaji = gajiPokok + (komisi * totalProyek) - pajak;
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
        System.out.print("\n3. " + employee + " \t |");
        System.out.print("\t  "+ nama);
        System.out.print("\t | ");
        System.out.print("   "+ nip);
        System.out.print("\t | ");
        System.out.print("\t\t\t  -\t\t\t\t |");
        System.out.print("\t\t"+ gajiPokok);
        System.out.print("\t\t | ");
        System.out.print("\t\t\t-\t\t\t |\t\t   -\t\t | ");
        System.out.print("\t\t\t"+ totalProyek);
        System.out.print("\t\t\t | \t\t\t\t-\t\t\t |");
        System.out.print("\n--------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        return super.toString()+
                " yang bernama " + nama +
                " dengan NIP " + nip +
                " mendapatkan Gaji Pokok sebesar Rp." + gajiPokok +
                ", \n   Dengan total proyek sebanyak " + totalProyek +
                ", sehingga " + nama +
                " mendapatkan Total Gaji Rp." +
                this.menghitungGaji()+ " Dipotong pajak 5% dari Gaji Pokok ";
    }
}
