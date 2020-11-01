/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbomodul3.nomor3;

import java.util.ArrayList;

public class Keluarga {
    private ArrayList<Anak> anakList = new ArrayList<Anak>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> child){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = child;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public ArrayList<Anak> getAnakList() {
        return anakList;
    }

    public void getDataKeluarga(){
        System.out.println("Nama Keluarga\t: " + getNamaKeluarga());
        System.out.println("Kota Asal\t\t: " + getKotaAsal());
        System.out.println("Nama Ayah\t\t: " + getAyah().getNamaAyah());
        System.out.println("Nama Ibu\t\t: " + getIbu().getNamaIbu());
        System.out.println("Data Anak\t\t: ");
        for(Anak bayi : getAnakList()){
            System.out.println( "\t\t\t\t  =============================");
            System.out.println("\t\t\t\t  Nama\t : " + bayi.getNamaAnak());
            System.out.println("\t\t\t\t  Umur\t : " + bayi.getUmurAnak());
            System.out.println("\t\t\t\t  Status : " + bayi.getStatusAnak());
        }
        System.out.println( "\t\t\t\t  =============================" );
    }

}