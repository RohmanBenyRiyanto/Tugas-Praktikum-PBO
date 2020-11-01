/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.pendaftaranmahasiswa;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String asal;
    private String gender;
    private int umur;
    private int NIM;

    public Mahasiswa(){}

    public Mahasiswa(String nama, String alamat, String asal, String gender, int umur, int NIM) {
        this.nama   = nama;
        this.alamat = alamat;
        this.asal   = asal;
        this.gender = gender;
        this.umur   = umur;
        this.NIM    = NIM;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAsal(){
        return asal;
    }

    public void setAsal(String asal){
        this.asal = asal;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public int getNIM(){
        return NIM;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }
}
