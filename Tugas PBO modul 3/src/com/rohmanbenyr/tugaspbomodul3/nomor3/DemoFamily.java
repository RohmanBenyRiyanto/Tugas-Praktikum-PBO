/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbomodul3.nomor3;

import java.util.ArrayList;

public class DemoFamily {
    public static void main(String[] args) {
        Keluarga fam1 = new Keluarga("Mbah Bayan", "Karanganyar");
        Ayah ayah = new Ayah(1972, "Beenie Sunarto", 48);
        Ibu ibu = new Ibu(1982, "Suyati", 38);
        ArrayList<Anak> anakList = new ArrayList<>();
        anakList.add(new Anak(1, "Rohman Beny Riyanto", 19, "Mahasiswa"));
        anakList.add(new Anak(2, "Luthfi Kamelia Putri", 11, "Pelajar"));
        fam1.addAnggotaKeluarga(ayah, ibu, anakList);
        fam1.getDataKeluarga();
    }
}