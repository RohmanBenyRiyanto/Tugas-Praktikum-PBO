package com.rohmanbenyr.modul5;

import java.util.Scanner;

public class Pengunjung {
    public static void main(String[] args) throws Exception{
        System.out.println("<--- Pelanggan --->");
        System.out.print("Jumlah pengunjung: ");
        int scan = scanInt();

        try {
            if (scan <= 10) {
                int[] jmlPengunjung = new int[scan];
                System.out.println("Masukan Data Pengunjung :");
                for (int i = 0; i < jmlPengunjung.length ; i++) {
                    System.out.print("UID " + ":\t");
                    jmlPengunjung[i] = scanInt();
                }

                System.out.println("\nLihat Data Pengunjung");

                while  (true) {
                    System.out.print("Indeks :\t");
                    int scanLihatData = scanInt();

                    if (scanLihatData > jmlPengunjung.length) {
                        throw new Exception("Index " + scanLihatData + " tidak ditemukan");
                    }

                    System.out.println("Data ke-" + scanLihatData + " " + jmlPengunjung[scanLihatData]);
                    System.out.print("lihat lagi (y/n) : ");
                    String inginLihatData = scanString();

                    if(inginLihatData == "n" || inginLihatData == "N") {
                        break;
                    }

                }

            } else {
                throw new Exception("MAX PENGUNJUM 10 DOANG!!!");
            }
        } catch (Exception e) {
            System.err.println("KAU GAUSAH TYPO WOY!");
        }
    }

    public static int scanInt() {
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        return (int) result;
    }

    public static String scanString() {
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        return (String) result;
    }
}