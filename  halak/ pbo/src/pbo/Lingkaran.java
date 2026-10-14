/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;


/**
 * Nim  : 41425010
 * Nama : Apostel M Simatupang
 * Motto: if at first you don t succeed, call it version 1.0
 */
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}


//Pertanyaan Pemantik:
//1. Mengapa kita perlu validasi r < 0? 
/* =>Kita perlu validasi r < 0 karena jari-jari lingkaran tidak boleh bernilai negatif.
/*Validasi ini mencegah pengguna memasukkan data yang tidak sesuai dan menghasilkan perhitungan luas serta keliling yang tidak tepat.*/

/*2.Dalam aplikasi nyata, di mana validasi input sangat penting? */

/*Validasi input sangat penting dalam aplikasi nyata, misalnya:
Aplikasi perbankan → memastikan jumlah transfer tidak negatif.
Aplikasi kasir → memastikan harga dan jumlah barang valid.
Sistem akademik → memastikan NIM dan nilai yang dimasukkan benar.
Form pendaftaran → memastikan data seperti umur, email, dan nomor telepon sesuai.
Aplikasi kesehatan → memastikan data seperti berat badan dan tinggi badan masuk akal.*/