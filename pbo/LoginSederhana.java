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
public class LoginSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                adaAngka = true;
                break;
            }
        }

        if (username.equals("admin") && password.length() >= 6 && adaAngka) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");

            if (!username.equals("admin")) {
                System.out.println("Username tidak valid.");
            } else if (password.length() < 6 || !adaAngka) {
                System.out.println("Password tidak valid.");
            }
        }
    }
}