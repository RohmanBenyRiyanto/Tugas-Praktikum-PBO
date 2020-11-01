/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor1;

public class Club {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;

    public Club() {
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("Nama Club\t\t: " + this.nama);
        System.out.println("Tahun Berdiri\t: " + this.tahunBerdiri);
        System.out.println("Nama Stadion\t: " + this.stadion);
        System.out.println("Juara UCL\t\t: " + this.juaraUcl);
        System.out.println("Deskripsi Club\t: " + this.deskripsi);
    }
}