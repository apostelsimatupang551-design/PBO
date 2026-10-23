/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Peminjaman_PC_di_Warner;

/**
 *
 * @author Apostel M Simatupang
 */

// Class exception buatan sendiri untuk peminjaman PC
public class PCTidakTersediaException extends Exception {

    // Constructor untuk menerima pesan kesalahan
    public PCTidakTersediaException(String pesan) {

        // Mengirim pesan ke class Exception
        // Pesan dapat ditampilkan menggunakan getMessage()
        super(pesan);
    }
}
