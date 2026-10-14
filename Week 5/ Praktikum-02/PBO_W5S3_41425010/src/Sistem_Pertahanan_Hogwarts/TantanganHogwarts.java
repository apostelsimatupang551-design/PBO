/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Pertahanan_Hogwarts;

/**
 *
 * @author Apostel M Simatupang
 */
 
import java.util.ArrayList;
import java.util.List;

// Kelas abstrak sebagai dasar mantra perlindungan Hogwarts.
abstract class MantraPerlindungan {

    // Setiap mantra wajib mempunyai cara aktivasi dan nonaktivasi.
    public abstract void aktifkan();

    public abstract void nonaktifkan();
}

// Mantra Protego untuk membentuk perisai.
class Protego extends MantraPerlindungan {

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Mantra Fidelius membutuhkan seorang secret keeper.
class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan.");
        System.out.println("Secret keeper: " + secretKeeper);
        System.out.println("Lokasi rahasia dilindungi.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perlindungan Fidelius dinonaktifkan.");
    }
}

// Mantra untuk mencegah apparition di area tertentu.
class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println(
                "Anti-Apparition diaktifkan di area " + area + "."
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println(
                "Anti-Apparition di area " + area + " dinonaktifkan."
        );
    }
}

// Kelas untuk mengelola semua mantra perlindungan.
class SistemPertahanan {

    // Menyimpan berbagai mantra dalam satu daftar.
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    // Menambahkan mantra ke sistem pertahanan.
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra ditambahkan ke sistem pertahanan.");
    }

    // Mengaktifkan seluruh mantra yang tersimpan.
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== AKTIVASI PERTAHANAN HOGWARTS ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan seluruh mantra yang tersimpan.
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN PERTAHANAN ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Kelas utama untuk menjalankan simulasi.
public class TantanganHogwarts {

    public static void main(String[] args) {

        // Membuat sistem pertahanan Hogwarts.
        SistemPertahanan sistem = new SistemPertahanan();

        // Membuat objek dari setiap jenis mantra.
        MantraPerlindungan protego = new Protego();

        MantraPerlindungan fidelius =
                new Fidelius("Albus Dumbledore");

        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        // Menambahkan mantra ke sistem pertahanan.
        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);

        // Mengaktifkan semua mantra.
        sistem.aktifkanSemuaMantra();

        // Menonaktifkan semua mantra.
        sistem.nonaktifkanSemuaMantra();
    }
}



/*
PENJELASAN CARA KERJA PROGRAM:

Program ini membuat sistem pertahanan Hogwarts menggunakan
abstract class MantraPerlindungan. Kelas Protego, Fidelius,
dan MantraAntiApparition mewarisi kelas tersebut serta memiliki
cara aktivasi dan nonaktivasi yang berbeda.

Kelas SistemPertahanan digunakan untuk menyimpan berbagai
mantra perlindungan dalam sebuah daftar. Method tambahMantra()
menambahkan mantra, sedangkan aktifkanSemuaMantra() dan
nonaktifkanSemuaMantra() menjalankan fungsi setiap mantra.

Program kemudian membuat objek dari ketiga jenis mantra,
memasukkannya ke sistem pertahanan, mengaktifkan semua mantra,
dan menonaktifkannya kembali. Polymorphism memungkinkan semua
mantra dikelola melalui tipe MantraPerlindungan yang sama.
*/