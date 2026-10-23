/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Penyewaan_Kendaraan;

/**
 *
 * @author Apostel M Simatupang
 */

 // Class Rental untuk mengatur proses penyewaan kendaraan
public class Rental {

    // Method untuk menyewa kendaraan
    // throws menyatakan bahwa method dapat menghasilkan custom exception
    public void sewaKendaraan(Kendaraan kendaraan, int hari)
            throws KendaraanTidakTersediaException {

        // Memeriksa apakah jumlah hari sewa valid
        if (hari <= 0) {

            // throw melempar exception jika hari kurang dari atau sama dengan nol
            throw new IllegalArgumentException(
                "Jumlah hari sewa harus lebih dari 0."
            );
        }

        // Memeriksa apakah kendaraan sedang tersedia
        if (!kendaraan.isTersedia()) {

            // Melempar custom exception jika kendaraan tidak tersedia
            throw new KendaraanTidakTersediaException(
                "Kendaraan tidak tersedia untuk disewa."
            );
        }

        // Mengubah status kendaraan menjadi tidak tersedia
        kendaraan.setTersedia(false);

        // Menghitung biaya sewa berdasarkan tarif dan jumlah hari
        int totalBiaya = kendaraan.getTarifPerHari() * hari;

        // Menampilkan pesan bahwa penyewaan berhasil
        System.out.println("Penyewaan berhasil.");

        // Menampilkan nama kendaraan yang disewa
        System.out.println("Kendaraan : " + kendaraan.getNama());

        // Menampilkan lama penyewaan
        System.out.println("Lama Sewa : " + hari + " hari");

        // Menampilkan total biaya penyewaan
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }
}