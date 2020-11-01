/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbo.modul4;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee employee = new SalariedEmployee("Paryoto", 1234566, 400000);
        Employee employee1 = new CommisionEmployee("Emii", 1234567, 5000000, 55, 250);
        Employee employee2 = new ProjectPlanner("Calon Mantu", 1234568, 2500000, 20000, 80);

        System.out.println(employee.cetakData());
        System.out.println();
        System.out.println(employee1.cetakData());
        System.out.println();
        System.out.println(employee2.cetakData());
        System.out.println();
    }
}
