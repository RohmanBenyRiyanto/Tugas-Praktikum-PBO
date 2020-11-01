/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.Suhu;

public class Fahrenheit {
    double toReamur(){
        //°Ré = (°F − 32) / 2,25
        return ((KonversiSuhu.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (°F + 459,67) / 1,8
        return ((KonversiSuhu.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //°C = (°F − 32) / 1,8
        return ((KonversiSuhu.SuhuAwal-32)/1.8);
    }
}