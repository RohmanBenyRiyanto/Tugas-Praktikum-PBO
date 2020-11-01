/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbomodul3.nomor3;

public class Ibu {
    private int idIbu;
    private String namaIbu;
    private int umurIbu;

    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }
}