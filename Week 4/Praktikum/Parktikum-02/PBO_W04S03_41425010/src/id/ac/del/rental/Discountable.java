/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
 package id.ac.del.rental;
/*
 * Nama  : Apostel Mangara Simatupang
 * NIM   : 41425010
 * Prodi : DIV-Teknologi Rekayasa Perangkat Lunak
 *
 * Program utama untuk menguji sistem rental.
 */

 
/*
 * Hasil Diskusi Kelompok:
 * Menurut kelompok kami, interface Discountable digunakan
 * sebagai aturan atau kontrak untuk semua jenis diskon.
 * Setiap class diskon yang menggunakan interface ini
 * wajib mempunyai method calculateDiscount().
 */
public interface Discountable {

    /*
     * Method ini digunakan untuk menghitung jumlah diskon
     * berdasarkan jumlah biaya yang diberikan.
     */
    double calculateDiscount(double amount);
}

