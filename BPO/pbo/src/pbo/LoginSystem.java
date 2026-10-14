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
public class LoginSystem {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Username dan password yang benar
        String usernameBenar = "admin";
        String passwordBenar = "password123";

        boolean berhasil = false;

        System.out.println("=== Sistem Login ===");

        // Maksimal 3 kali percobaan
        for (int percobaan = 1; percobaan <= 3; percobaan++) {

            System.out.println("\nPercobaan " + percobaan + ":");

            System.out.print("Username: ");
            String username = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            // Validasi panjang username
            if (username.length() < 5 || username.length() > 10) {

                System.out.println(
                    "Login gagal! Username harus antara 5-10 karakter."
                );
                continue;
            }

            // Validasi panjang password
            if (password.length() < 8) {

                System.out.println(
                    "Login gagal! Password harus minimal 8 karakter."
                );
                continue;
            }

            // Mengecek apakah password mengandung angka
            boolean adaAngka = false;

            for (int i = 0; i < password.length(); i++) {

                if (Character.isDigit(password.charAt(i))) {
                    adaAngka = true;
                    break;
                }
            }

            if (!adaAngka) {

                System.out.println(
                    "Login gagal! Password harus mengandung angka."
                );
                continue;
            }

            // Mengecek username dan password
            if (username.equals(usernameBenar)
                    && password.equals(passwordBenar)) {

                System.out.println("Login berhasil!");
                berhasil = true;
                break;

            } else {

                System.out.println("Login gagal! Username atau password salah.");
            }
        }

        // Jika tidak berhasil setelah 3 percobaan
        if (!berhasil) {
            System.out.println("\nAkun terkunci! Terlalu banyak percobaan gagal.");
        }

        input.close();
    }
}

