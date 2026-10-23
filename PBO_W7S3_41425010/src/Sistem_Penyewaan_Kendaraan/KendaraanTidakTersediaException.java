/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Penyewaan_Kendaraan;

/**
 *
 * @author Apostel M Simatupang
 */
// Class exception buatan sendiri untuk rental kendaraan
public class KendaraanTidakTersediaException extends Exception {

    // Constructor menerima pesan kesalahan
    public KendaraanTidakTersediaException(String pesan) {

        // Mengirim pesan ke class Exception agar bisa dibaca
        // menggunakan method getMessage()
        super(pesan);
    }
}
