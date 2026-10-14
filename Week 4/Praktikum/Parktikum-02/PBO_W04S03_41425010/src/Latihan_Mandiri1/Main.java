/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_Mandiri1;

/**
 *
 * @author Apostel M Simatupang
 */
public class Main {
   
    public static void main(String[] args) {

        StudentGrade mahasiswa =
                new StudentGrade("41425010", "Apostel Mangara Simatupang");

        // Mengisi nilai kuis.
        mahasiswa.setNilaiKuis(85);

        // Mengisi nilai UTS.
        mahasiswa.setNilaiUTS(90);

        // Mencoba memasukkan nilai yang salah.
        mahasiswa.setNilaiKuis(120);

        // Menampilkan laporan.
        mahasiswa.cetakLaporan();
    }
}

