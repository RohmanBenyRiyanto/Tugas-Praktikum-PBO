/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.tugaspbo.modul4;

public abstract class Employee {
    public String employee;

    public Employee(String employee) {
        this.employee = employee;
    }

    protected abstract float menghitungGaji();

    protected abstract String cetakData();

    @Override
    public String toString() {
        return " \n   Jadi, Hasil Gaji " + employee;
    }
}
