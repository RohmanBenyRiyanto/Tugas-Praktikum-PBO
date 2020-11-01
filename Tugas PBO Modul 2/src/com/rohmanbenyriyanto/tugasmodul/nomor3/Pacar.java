/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor3;

public class Pacar extends Mahasiswa {
    public String namaPacar = "Jamilah";
    public int lamaHubungan = 4;

    public Pacar() {
    }

    public void getStatus() {
        System.out.println("Nama Pacar\t\t: " + this.namaPacar);
        System.out.println("Lama Hubungan\t: " + this.lamaHubungan);
    }
}