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
public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

// - - Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int?
/*Perbedaan nilai asli double dengan hasil casting int adalah nilai double masih memiliki angka desimal, 
sedangkan setelah di-casting ke int, angka di belakang koma akan dihilangkan tanpa dibulatkan.*/

//Praktek 2: Mengapa pembagian int perlu di-casting ke double? 
/*Pembagian int perlu di-casting ke double agar hasil pembagian dapat menampilkan angka desimal, 
karena jika kedua nilai bertipe int, hasil pembagian hanya menghasilkan bilangan bulat.*/

 
