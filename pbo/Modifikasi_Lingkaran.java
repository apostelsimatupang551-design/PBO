package pbo;

import java.util.Scanner;

/*
Nama  : Apostel Mangara Simatupang
NIM   : 41425010
Prodi : D4 Teknologi Rekayasa Perangkat Lunak
*/
public class Modifikasi_Lingkaran {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Validasi jika jari-jari negatif
        if (r < 0) {

            System.out.println("Error: Jari-jari tidak boleh bernilai negatif.");

        } else {

            // Menghitung luas lingkaran
            double luas = Math.PI * r * r;

            // Menghitung keliling lingkaran
            double keliling = 2 * Math.PI * r;

            // Menampilkan hasil
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Jari-jari : " + r);
            System.out.println("Luas      : " + luas);
            System.out.println("Keliling  : " + keliling);
        }

        // Menutup Scanner
        input.close();
    }
}