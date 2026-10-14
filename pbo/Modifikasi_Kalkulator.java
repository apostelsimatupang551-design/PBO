/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package pbo;

import java.util.Scanner;


/*
Nama  : Apostel Mangara Simatupang
NIM   : 41425010
Prodi : D4 Teknologi Rekayasa Perangkat Lunak
*/
public class Modifikasi_Kalkulator {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Melakukan operasi aritmatika dasar
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;

        // Menampilkan hasil operasi dasar
        System.out.println("\n=== HASIL KALKULATOR ===");
        System.out.println("Penjumlahan : " + penjumlahan);
        System.out.println("Pengurangan : " + pengurangan);
        System.out.println("Perkalian   : " + perkalian);

        // Mengecek agar angka kedua tidak sama dengan 0
        if (angka2 != 0) {

            // Menghitung pembagian
            double pembagian = angka1 / angka2;

            // Menghitung modulus atau sisa bagi
            double modulus = angka1 % angka2;

            System.out.println("Pembagian   : " + pembagian);
            System.out.println("Modulus     : " + modulus);

        } else {

            // Pesan jika angka kedua adalah 0
            System.out.println("Pembagian   : Tidak dapat dibagi dengan 0");
            System.out.println("Modulus     : Tidak dapat dilakukan dengan 0");
        }

        // Menghitung perpangkatan menggunakan Math.pow()
        double pangkat = Math.pow(angka1, angka2);

        // Menampilkan hasil perpangkatan
        System.out.println("Perpangkatan: " + pangkat);

        // Menutup Scanner
        input.close();
    }
}