/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_01;

/**
 *
 * @author Apostel M Simatupang
 */

class Mahasiswa {
    String nama;
    String nim;
}

// Hilangkan kata 'public' agar tidak bentrok dengan nama file Mahasiswa.java
class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Budi";
        m1.nim = "12345";

        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);
    }
}