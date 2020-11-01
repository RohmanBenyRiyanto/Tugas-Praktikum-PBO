/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbomodul3.nomor1;

public class DemoPerumahan {
    public static void main(String[] args) {
        Rumah rumah1 = new Rumah("01", "Boruto", 4);
        Rumah rumah2 = new Rumah("02", "Sarada", 3);
        Rumah rumah3 = new Rumah("03", "Mitsuki", 4);
        Rumah rumah4 = new Rumah("04", "Konohamaru", 2);

        Komplek komplek1 = new Komplek("AB", "Tim 7");

        komplek1.addRumah(rumah1.getIdRumah());
        komplek1.addRumah(rumah2.getIdRumah());
        komplek1.addRumah(rumah3.getIdRumah());
        komplek1.addRumah(rumah4.getIdRumah());

        komplek1.getDataKomplek();
    }
}