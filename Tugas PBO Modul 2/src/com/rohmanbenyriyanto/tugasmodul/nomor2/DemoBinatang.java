/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor2;

public class DemoBinatang {
    public DemoBinatang() {
    }

    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.nama = "Burung Kutilang";
        burung.makan = "Buah - Buahan dan Serangga";
        burung.tidur = "Tidur Kalau Malam";
        burung.terbang = "Menggunakan Sayap lah";
        System.out.println("\t\t\t ~~~~ BURUNG ~~~~ ");
        burung.getNama();
        burung.binatang();
        burung.terbang();
        System.out.println();
        Ikan ikan = new Ikan();
        ikan.nama = "Tongkol";
        ikan.makan = "Ikan Kecil";
        ikan.tidur = "Pada Malam Hari";
        ikan.berenang = "Menggunakan Sirip";
        System.out.println();
        System.out.println("\t\t\t ~~~~ IKAN ~~~~ ");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();
        System.out.println();
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Oyen";
        kucing.makan = "Whiskas";
        kucing.tidur = "Tidur Terus Malasan";
        kucing.meong = "Kucing Oyen Pendiam, Jadi Tidak Meong2";
        System.out.println();
        System.out.println("\t\t\t ~~~~ KUCING ~~~~ ");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
        System.out.println("\n\n\t\t\t\tRohman Beny R (19104060)");
    }
}