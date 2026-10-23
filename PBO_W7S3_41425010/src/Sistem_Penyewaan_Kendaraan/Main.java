/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Penyewaan_Kendaraan;

/**
 *
 * @author Apostel M Simatupang
 */
// Class Main sebagai driver untuk menjalankan program
public class Main {

    // Method main merupakan titik awal program Java
    public static void main(String[] args) {

        // Membuat objek kendaraan dengan tarif Rp250.000 per hari
        // Status true berarti kendaraan tersedia
        Kendaraan kendaraan = new Kendaraan(
            "Mobil Avanza", 250000, true
        );

        // Membuat objek Rental untuk mengelola penyewaan
        Rental rental = new Rental();

        // Menampilkan judul data kendaraan
        System.out.println("=== DATA KENDARAAN ===");

        // Memanggil method untuk menampilkan informasi kendaraan
        kendaraan.tampilInfo();

        // try menjalankan kode yang mungkin menghasilkan exception
        try {

            // Menyewa kendaraan selama 3 hari
            rental.sewaKendaraan(kendaraan, 3);

            // Aktifkan baris berikut untuk menguji custom exception
            // setelah penyewaan pertama berhasil
            // rental.sewaKendaraan(kendaraan, 2);

            // Aktifkan baris berikut untuk menguji jumlah hari tidak valid
            // rental.sewaKendaraan(kendaraan, 0);

        } catch (KendaraanTidakTersediaException e) {

            // Menangani kesalahan ketika kendaraan tidak tersedia
            System.out.println("Kesalahan: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            // Menangani kesalahan ketika jumlah hari tidak valid
            System.out.println("Input salah: " + e.getMessage());

        } finally {

            // finally tetap dijalankan setelah try/catch selesai
            // baik penyewaan berhasil maupun terjadi exception
            System.out.println("Proses penyewaan selesai.");
        }

        // Menampilkan judul status kendaraan setelah penyewaan
        System.out.println("\n=== STATUS AKHIR ===");

        // Menampilkan informasi dan status terbaru kendaraan
        kendaraan.tampilInfo();
    }
}