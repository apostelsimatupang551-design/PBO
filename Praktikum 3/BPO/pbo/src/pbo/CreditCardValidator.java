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
public class CreditCardValidator { 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String kartu = input.nextLine();

        // Menghapus tanda hubung dari nomor kartu
        String nomor = kartu.replace("-", "");

        boolean valid = true;

        // Validasi jumlah digit
        if (nomor.length() != 16) {

            valid = false;

            System.out.println(
                "Nomor kartu tidak valid!"
            );

            System.out.println(
                "Harus terdiri dari 16 digit."
            );
        }

        // Validasi agar semua karakter berupa angka
        for (int i = 0; i < nomor.length(); i++) {

            if (!Character.isDigit(nomor.charAt(i))) {

                valid = false;

                System.out.println(
                    "Nomor kartu tidak valid!"
                );

                System.out.println(
                    "Nomor kartu hanya boleh berisi digit."
                );

                break;
            }
        }

        // Validasi digit pertama
        if (nomor.length() > 0) {

            char digitPertama = nomor.charAt(0);

            if (digitPertama != '4'
                    && digitPertama != '5'
                    && digitPertama != '6') {

                valid = false;

                System.out.println(
                    "Nomor kartu tidak valid!"
                );

                System.out.println(
                    "Harus dimulai dengan 4, 5, atau 6."
                );
            }
        }

        // Validasi posisi tanda hubung
        if (kartu.contains("-")) {

            String[] bagian = kartu.split("-");

            if (bagian.length != 4) {

                valid = false;

                System.out.println(
                    "Nomor kartu tidak valid!"
                );

                System.out.println(
                    "Tanda hubung harus digunakan setiap 4 digit."
                );

            } else {

                for (String bagianNomor : bagian) {

                    if (bagianNomor.length() != 4) {

                        valid = false;

                        System.out.println(
                            "Nomor kartu tidak valid!"
                        );

                        System.out.println(
                            "Setiap bagian harus terdiri dari 4 digit."
                        );

                        break;
                    }
                }
            }
        }

        // Menampilkan hasil akhir
        if (valid) {

            System.out.println("Nomor kartu valid!");
        }

        input.close();
    }
}
