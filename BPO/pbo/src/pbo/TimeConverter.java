/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;
/**
 * Nim  : 41425010
 * Nama : Apostel M Simatupang
 * Motto: if at first you don t succeed, call it version 1.0
 */

public class TimeConverter {
     
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");

        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {

            // Konversi detik ke jam, menit, detik
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = input.nextInt();

            if (totalDetik < 0) {

                System.out.println("Jumlah detik tidak boleh negatif.");

            } else {

                int jam = totalDetik / 3600;
                int sisa = totalDetik % 3600;

                int menit = sisa / 60;
                int detik = sisa % 60;

                System.out.printf(
                    "Hasil: %02d:%02d:%02d%n",
                    jam, menit, detik
                );
            }

        } else if (pilihan == 2) {

            // Konversi HH:MM:SS ke total detik
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = input.nextLine();

            String[] bagian = waktu.split(":");

            if (bagian.length != 3) {

                System.out.println(
                    "Format salah! Gunakan HH:MM:SS."
                );

            } else {

                try {

                    int jam = Integer.parseInt(bagian[0]);
                    int menit = Integer.parseInt(bagian[1]);
                    int detik = Integer.parseInt(bagian[2]);

                    // Validasi menit dan detik
                    if (jam < 0 || menit < 0 || menit > 59
                            || detik < 0 || detik > 59) {

                        System.out.println(
                            "Waktu tidak valid."
                        );

                    } else {

                        int totalDetik =
                                (jam * 3600)
                                + (menit * 60)
                                + detik;

                        System.out.println(
                            "Hasil: " + totalDetik + " detik"
                        );
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                        "Format waktu tidak valid."
                    );
                }
            }

        } else {

            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}

