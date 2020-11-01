/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor2;

public class Ikan extends Binatang {
    public String nama;
    public String berenang;

    public Ikan() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void berenang() {
        System.out.println("Tingkah Laku\t: " + this.berenang);
    }
}