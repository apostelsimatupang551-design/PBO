/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_02;

/**
 *
 * @author Apostel M Simatupang
 */

// Class Superclass (Mahasiswa Biasa)
class Mahasiswa {
    String nama;
    String nim;
}

// Class Subclass (Mahasiswa Aktif yang mewarisi Mahasiswa)
public class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

// Hilangkan kata 'public' pada class Main agar tidak bentrok dengan nama file MahasiswaAktif.java
class Main {
    public static void main(String[] args) {
        // Membuat objek dari class MahasiswaAktif
        MahasiswaAktif m2 = new MahasiswaAktif();

        // Mengisi data atribut
        m2.nama = "Dina";
        m2.nim = "123456";
        m2.semester = 5;

        // Menampilkan output sesuai ketentuan
        System.out.println("Nama: " + m2.nama);
        System.out.println("NIM: " + m2.nim);
        m2.belajar();
    }
}