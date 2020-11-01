/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor3;

public class Mahasiswa {
    public String nama = "Paino";
    public String status = "Pacaran Sejak Dini";
    public int semester = 9;

    public Mahasiswa() {
    }

    public void getStatus() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Status\t\t\t: " + this.status);
        System.out.println("Semester\t\t: " + this.semester);
    }
}