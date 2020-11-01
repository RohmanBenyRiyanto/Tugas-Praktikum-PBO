/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor2;

public class Burung extends Binatang {
    public String nama;
    public String terbang;

    public Burung() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void terbang() {
        System.out.println("Tingkah Laku\t: " + this.terbang);
    }
}