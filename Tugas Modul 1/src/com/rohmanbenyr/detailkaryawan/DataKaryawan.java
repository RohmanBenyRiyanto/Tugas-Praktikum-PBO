/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.rohmanbenyr.detailkaryawan;

import java.util.Scanner;

public class DataKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//deklarasi input data
        Karyawan kry = new Karyawan();
        System.out.println("Masukan nomor karyawan :*");
        String no_karyawan = sc.nextLine();
        System.out.println("Masukan nama karyawan :*");
        String nama = sc.nextLine();
        System.out.println("Masukan alamat karyawan :*");
        String alamat = sc.nextLine();
        System.out.println("Masukan jenis kelamin karyawan :*");
        String jenis_kelamin = sc.nextLine();
        System.out.println("Masukan jabatan karyawan :*");
        String jabatan = sc.nextLine();
        System.out.println("Masukan gaji kotor :*");
        double gajiKotor = sc.nextDouble();

        kry.setNo_karyawan(no_karyawan);
        kry.setNamaKaryawan(nama);
        kry.setAlamatKaryawan(alamat);
        kry.setJenisKelamin(jenis_kelamin);
        kry.setJabatan(jabatan);
        kry.setGajiKotor(gajiKotor);

        System.out.println();
        System.out.print("Nomor Karyawan : ");
        System.out.println(kry.getNo_karyawan());
        System.out.print("Nama Karyawan : ");
        System.out.println(kry.getNamaKaryawan());
        System.out.print("Alamat Karyawan : ");
        System.out.println(kry.getAlamatKaryawan());
        System.out.print("Jenis Kelamin : ");
        System.out.println(kry.getJenisKelamin());
        System.out.print("Jabatan Karyawan : ");
        System.out.println(kry.getJabatan());
        System.out.print("Gaji Kotor Karyawan : ");
        System.out.println(kry.getGajikotor());
        System.out.print("Gaji Bersih Karyawan : ");
        kry.hitungGajiBersih(kry.getGajikotor());
        System.out.println(kry.getGajiBersih());
    }
}
