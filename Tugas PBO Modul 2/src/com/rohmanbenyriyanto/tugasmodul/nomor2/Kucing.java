/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor2;

public class Kucing extends Binatang {
    public String nama;
    public String meong;

    public Kucing() {
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + this.nama);
    }

    public void meong() {
        System.out.println("Tingkah Laku\t: " + this.meong);
    }
}