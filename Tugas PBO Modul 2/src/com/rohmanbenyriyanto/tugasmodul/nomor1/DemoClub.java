/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyriyanto.tugasmodul.nomor1;

public class DemoClub {
    public DemoClub() {
    }

    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Juventus");
        Club club3 = new Club("Juventus", "Juventus Football Club adalah sebuah klub sepak bola di Liga Italia");
        Club club4 = new Club("Juventus", 1897, "Allianz Stadium");
        Club club5 = new Club("Juventus", 1897, "Allianz Stadium", 2, "Juventus Football Club adalah sebuah klub sepak bola di Liga Italia");
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}