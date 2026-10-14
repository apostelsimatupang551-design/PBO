/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author Apostel M Simatupang
 */
 
// Kelas abstrak sebagai dasar berbagai jenis mantra.
abstract class MantraAbstrak {

    // Method abstrak belum memiliki isi implementasi.
    public abstract void efek();
}

// Kelas Expelliarmus mengimplementasikan efek().
class Expelliarmus extends MantraAbstrak {

    @Override
    public void efek() {
        System.out.println("Expelliarmus melucuti senjata lawan!");
    }
}

// Kelas Lumos ditambahkan sesuai instruksi praktikum.
class Lumos extends MantraAbstrak {

    @Override
    public void efek() {
        System.out.println("Lumos menghasilkan cahaya!");
    }
}

// Kelas utama untuk menguji abstract class.
public class DemoMantraAbstrak {

    public static void main(String[] args) {

        // Objek dibuat dari kelas konkret.
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new Lumos();

        // Memanggil efek sesuai jenis objek.
        mantra1.efek();
        mantra2.efek();

        // MantraAbstrak m = new MantraAbstrak();
        // Baris di atas tidak dapat dijalankan karena kelas abstrak.
    }
}



/*
PENJELASAN CARA KERJA PROGRAM:

Program ini menggunakan abstract class MantraAbstrak yang
memiliki method abstrak efek(). Kelas Expelliarmus dan Lumos
mewarisi kelas tersebut dan memberikan implementasi masing-masing.

Ketika method efek() dipanggil, setiap objek menampilkan efek
mantra yang berbeda. Kelas abstrak digunakan sebagai dasar
agar setiap kelas turunan memiliki method efek().

Objek MantraAbstrak tidak dapat dibuat secara langsung karena
kelas tersebut merupakan abstract class.
*/