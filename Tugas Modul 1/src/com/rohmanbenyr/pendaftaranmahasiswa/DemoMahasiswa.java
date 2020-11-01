/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.pendaftaranmahasiswa;

public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa arrayMahasiswa[] = new Mahasiswa[5];

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Tejo");
        mahasiswa1.setAlamat("Konoha");
        mahasiswa1.setAsal("SMK 1 Konohagakure");
        mahasiswa1.setGender("P");
        mahasiswa1.setUmur(19);
        mahasiswa1.setNIM(1001);

        Mahasiswa mahasiswa2 = new Mahasiswa("Painem", "Jakarta", "SMA N 1 Jakarta", "P", 20, 1002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Tarjo", "Surakarta", "SMA N 3 Surakarta", "L", 21, 1003);
        Mahasiswa mahasiswa4 = new Mahasiswa("Sakiman", "Semarang", "SMA N 1 Semarang", "L", 19, 1004);
        Mahasiswa mahasiswa5 = new Mahasiswa("Sabar", "Kalimantan", "SMA N 1 Kalimantan", "L", 20, 1005);

        arrayMahasiswa[0] = mahasiswa1;
        arrayMahasiswa[1] = mahasiswa2;
        arrayMahasiswa[2] = mahasiswa3;
        arrayMahasiswa[3] = mahasiswa4;
        arrayMahasiswa[4] = mahasiswa5;

        for (Mahasiswa x : arrayMahasiswa){
            System.out.println("Selamat anda diterima di Universitas Akatsuki");
            System.out.println("Nama\t\t\t: " + x.getNama());
            System.out.println("Alamat\t\t\t: " + x.getAlamat());
            System.out.println("Asal Sekolah\t: " + x.getAsal());
            System.out.println("Gender\t\t\t: " + x.getGender());
            System.out.println("Umur\t\t\t: " + x.getUmur());
            System.out.println("NIM\t\t\t\t: " + x.getNIM());
            System.out.println("\n");
        }
    }
}
