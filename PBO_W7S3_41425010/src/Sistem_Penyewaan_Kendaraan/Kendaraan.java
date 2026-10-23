/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Penyewaan_Kendaraan;

/**
 *
 * @author Apostel M Simatupang
 */

 // Class Kendaraan untuk menyimpan data kendaraan rental
public class Kendaraan {

    // Menyimpan nama kendaraan
    private String nama;

    // Menyimpan tarif sewa kendaraan per hari
    private int tarifPerHari;

    // Menyimpan status ketersediaan kendaraan
    private boolean tersedia;

    // Constructor untuk mengisi data kendaraan
    public Kendaraan(String nama, int tarifPerHari, boolean tersedia) {
        this.nama = nama;                 // Mengisi nama kendaraan
        this.tarifPerHari = tarifPerHari; // Mengisi tarif sewa
        this.tersedia = tersedia;         // Mengisi status kendaraan
    }

    // Mengembalikan nama kendaraan
    public String getNama() {
        return nama;
    }

    // Mengembalikan tarif sewa per hari
    public int getTarifPerHari() {
        return tarifPerHari;
    }

    // Memeriksa apakah kendaraan tersedia
    public boolean isTersedia() {
        return tersedia;
    }

    // Mengubah status ketersediaan kendaraan
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Menampilkan informasi kendaraan
    public void tampilInfo() {
        System.out.println("Nama Kendaraan : " + nama); // Menampilkan nama
        System.out.println("Tarif per Hari : Rp" + tarifPerHari); // Menampilkan tarif
        System.out.println("Tersedia       : " + tersedia); // Menampilkan status
    }
}