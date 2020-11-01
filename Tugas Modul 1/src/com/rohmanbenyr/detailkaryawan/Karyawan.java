/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.detailkaryawan;

public class Karyawan extends biodataKaryawan {
    private String no_karyawan;
    private String jabatan;
    private double gajikotor;
    private double gajibersih;

    Karyawan() {

    }

   Karyawan(String no_karyawan, String nama_karyawan, String alamat_karyawan, String jenis_kelamin, String jabatan, double gajikotor) {
        this.no_karyawan   = no_karyawan;
        this.nama          = nama_karyawan;
        this.alamat        = alamat_karyawan;
        this.jenis_kelamin = jenis_kelamin;
        this.jabatan       = jabatan;
        this.gajikotor     = gajikotor;
    }

    void setNo_karyawan(String no_karyawan){
        this.no_karyawan = no_karyawan;
    }

    String getNo_karyawan() {
        return this.no_karyawan;
    }

    public void setNamaKaryawan (String nama_karyawan) {
        this.nama = nama_karyawan;
    }

    public String getNamaKaryawan() {
        return this.nama;
    }

    public void setAlamatKaryawan(String alamat_karyawan) {
        this.alamat = alamat_karyawan;
    }

    public String getAlamatKaryawan(){
        return this.alamat;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenisKelamin(){
        return this.jenis_kelamin;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan(){
        return this.jabatan;
    }

    public void setGajiKotor(double gajiKotor) {
        this.gajikotor = gajiKotor;
    }

    public double getGajikotor() {
        return this.gajikotor;
    }

    public double getGajiBersih() {
        return this.gajibersih;
    }

    public double hitungGajiBersih(double gajikotor) {
        this .gajibersih = 0;
        this.gajibersih = gajikotor * 90 / 100;
        return this.gajibersih;
    }

}
