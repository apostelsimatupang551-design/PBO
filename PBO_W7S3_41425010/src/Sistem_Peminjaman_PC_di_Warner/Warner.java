/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Peminjaman_PC_di_Warner;

/**
 *
 * @author Apostel M Simatupang
 */
 
// Class Warner digunakan untuk mengelola peminjaman PC
public class Warner {

    // Method untuk meminjam PC selama beberapa jam
    // throws menyatakan bahwa method dapat menghasilkan custom exception
    public void pinjamPC(PC pc, int jam)
            throws PCTidakTersediaException {

        // Memeriksa apakah durasi penggunaan valid
        if (jam <= 0) {

            // throw melempar exception jika durasi tidak valid
            throw new IllegalArgumentException(
                "Durasi penggunaan harus lebih dari 0 jam."
            );
        }

        // Memeriksa apakah PC tersedia untuk digunakan
        if (!pc.isTersedia()) {

            // Melempar custom exception jika PC sedang digunakan
            throw new PCTidakTersediaException(
                "PC sedang digunakan dan tidak dapat dipinjam."
            );
        }

        // Mengubah status PC menjadi tidak tersedia
        pc.setTersedia(false);

        // Menghitung biaya berdasarkan tarif dan lama penggunaan
        int totalBiaya = pc.getTarifPerJam() * jam;

        // Menampilkan pesan bahwa peminjaman berhasil
        System.out.println("Peminjaman PC berhasil.");

        // Menampilkan nomor PC yang digunakan
        System.out.println("Nomor PC       : " + pc.getNomorPC());

        // Menampilkan durasi penggunaan PC
        System.out.println("Durasi         : " + jam + " jam");

        // Menampilkan total biaya penggunaan PC
        System.out.println("Total Biaya    : Rp" + totalBiaya);
    }
}
