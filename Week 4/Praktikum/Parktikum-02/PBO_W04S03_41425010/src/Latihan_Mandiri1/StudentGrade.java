/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_Mandiri1;


/*
 * Nama  : Apostel Mangara Simatupang
 * NIM   : 41425010
 * Prodi : DIV-Teknologi Rekayasa Perangkat Lunak
 *
 * Program untuk mengelola nilai mahasiswa.
 */

public class StudentGrade {

    // Semua atribut dibuat private untuk menerapkan encapsulation.
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    // Constructor.
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;

        // Nilai awal.
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;

        // Grade awal dihitung otomatis.
        updateGrade();
    }

    // Getter NIM.
    // Tidak ada setter sehingga NIM bersifat read-only.
    public String getNim() {
        return nim;
    }

    // Getter nama.
    // Tidak ada setter sehingga nama bersifat read-only.
    public String getNama() {
        return nama;
    }

    // Getter nilai kuis.
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Setter nilai kuis dengan validasi.
    public void setNilaiKuis(double nilaiKuis) {

        if (nilaiKuis >= 0 && nilaiKuis <= 100) {
            this.nilaiKuis = nilaiKuis;

            // Grade dihitung ulang jika nilai berhasil diubah.
            updateGrade();

            System.out.println("Nilai Kuis berhasil diubah.");
        } else {
            System.out.println(
                "Error: Nilai Kuis harus berada antara 0 sampai 100."
            );
        }
    }

    // Getter nilai UTS.
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Setter nilai UTS dengan validasi.
    public void setNilaiUTS(double nilaiUTS) {

        if (nilaiUTS >= 0 && nilaiUTS <= 100) {
            this.nilaiUTS = nilaiUTS;

            // Grade dihitung ulang.
            updateGrade();

            System.out.println("Nilai UTS berhasil diubah.");
        } else {
            System.out.println(
                "Error: Nilai UTS harus berada antara 0 sampai 100."
            );
        }
    }

    // Menghitung nilai akhir.
    public double hitungNilaiAkhir() {

        return (0.40 * nilaiKuis) + (0.60 * nilaiUTS);
    }

    // Getter grade.
    // Grade tidak memiliki setter sehingga bersifat read-only.
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Method private untuk menentukan grade secara otomatis.
    private void updateGrade() {

        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Method untuk mencetak laporan.
    public void cetakLaporan() {

        System.out.println("\n=== LAPORAN HASIL STUDI ===");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Kuis   : " + nilaiKuis);
        System.out.println("Nilai UTS    : " + nilaiUTS);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Grade Huruf  : " + gradeHuruf);
    }
}
