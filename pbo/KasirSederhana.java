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
public class KasirSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon = 0;

        if (total >= 100000) {
            diskon = total * 0.10;
        }

        double totalBayar = total - diskon;

        System.out.println("Total sebelum diskon: " + (int) total);
        System.out.println("Diskon: " + (int) diskon);
        System.out.println("Total bayar: " + (int) totalBayar);
    }
}