/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Peminjaman_PC_di_Warner;

/**
 *
 * @author Apostel M Simatupang
 */

// Class Main merupakan driver untuk menjalankan program
public class Main {

    // Method main adalah titik awal program Java
    public static void main(String[] args) {

        // Membuat objek PC nomor 1 dengan tarif Rp5.000 per jam
        // Status true berarti PC tersedia untuk digunakan
        PC pc = new PC(1, 5000, true);

        // Membuat objek Warner untuk mengelola peminjaman PC
        Warner warner = new Warner();

        // Menampilkan judul informasi awal PC
        System.out.println("=== DATA AWAL PC ===");

        // Menampilkan informasi PC sebelum digunakan
        pc.tampilInfo();

        // try menjalankan kode yang mungkin menghasilkan exception
        try {

            // Meminjam PC nomor 1 selama 3 jam
            warner.pinjamPC(pc, 3);

            // Aktifkan baris berikut untuk menguji custom exception
            // setelah peminjaman pertama berhasil
            // warner.pinjamPC(pc, 2);

            // Aktifkan baris berikut untuk menguji durasi tidak valid
            // warner.pinjamPC(pc, 0);

        } catch (PCTidakTersediaException e) {

            // Menangani kesalahan jika PC sedang tidak tersedia
            System.out.println("Kesalahan: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            // Menangani kesalahan jika durasi penggunaan tidak valid
            System.out.println("Input salah: " + e.getMessage());

        } finally {

            // finally tetap dijalankan setelah try/catch selesai
            // baik peminjaman berhasil maupun terjadi exception
            System.out.println("Proses peminjaman PC selesai.");
        }

        // Menampilkan judul informasi akhir PC
        System.out.println("\n=== DATA AKHIR PC ===");

        // Menampilkan status PC setelah proses peminjaman
        pc.tampilInfo();
    }
}
