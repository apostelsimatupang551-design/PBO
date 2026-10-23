/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Peminjaman_PC_di_Warner;

/**
 *
 * @author Apostel M Simatupang
 */

// Class PC digunakan untuk menyimpan data komputer di warner
public class PC {

    // Atribut untuk menyimpan nomor PC
    private int nomorPC;

    // Atribut untuk menyimpan tarif penggunaan PC per jam
    private int tarifPerJam;

    // Atribut untuk menyimpan status ketersediaan PC
    private boolean tersedia;

    // Constructor untuk mengisi data awal PC
    public PC(int nomorPC, int tarifPerJam, boolean tersedia) {
        this.nomorPC = nomorPC;       // Mengisi nomor PC
        this.tarifPerJam = tarifPerJam; // Mengisi tarif per jam
        this.tersedia = tersedia;     // Mengisi status ketersediaan
    }

    // Method untuk mengambil nomor PC
    public int getNomorPC() {
        return nomorPC;
    }

    // Method untuk mengambil tarif penggunaan per jam
    public int getTarifPerJam() {
        return tarifPerJam;
    }

    // Method untuk memeriksa apakah PC tersedia
    public boolean isTersedia() {
        return tersedia;
    }

    // Method untuk mengubah status ketersediaan PC
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Method untuk menampilkan informasi PC
    public void tampilInfo() {
        System.out.println("Nomor PC       : " + nomorPC);
        System.out.println("Tarif per Jam  : Rp" + tarifPerJam);
        System.out.println("Status Tersedia: " + tersedia);
    }
}
