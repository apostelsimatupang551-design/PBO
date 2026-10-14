/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama   : Apostel M Simatupang
 * NIM    : 41425010
 * Prodi  : D4 Teknologi Rekayasa Perangkat Lunak
 */
package Method_Overriding;

// Import List dan ArrayList agar dapat digunakan.
import java.util.ArrayList;
import java.util.List;

// Kelas abstrak yang menjadi dasar seluruh mantra.
abstract class MantraDunia {

    // Setiap mantra wajib memiliki efek().
    public abstract void efek();
}

// Mantra untuk melucuti senjata lawan.
class ExpelliarmusDunia extends MantraDunia {

    @Override
    public void efek() {
        System.out.println("Expelliarmus melucuti senjata lawan!");
    }
}

// Mantra untuk menghasilkan cahaya.
class LumosDunia extends MantraDunia {

    @Override
    public void efek() {
        System.out.println("Lumos menerangi ruangan!");
    }
}

// Mantra untuk mengangkat benda.
class WingardiumLeviosa extends MantraDunia {

    @Override
    public void efek() {
        System.out.println("Wingardium Leviosa mengangkat benda!");
    }
}

// Kelas penyihir yang dapat mempelajari banyak mantra.
class PenyihirDunia {

    private String nama;

    // Menyimpan mantra yang telah dipelajari.
    private List<MantraDunia> daftarMantra = new ArrayList<>();

    // Constructor untuk menentukan nama penyihir.
    public PenyihirDunia(String nama) {
        this.nama = nama;
    }

    // Menambahkan mantra ke daftar mantra penyihir.
    public void pelajariMantra(MantraDunia mantra) {
        daftarMantra.add(mantra);
    }

    // Mengucapkan semua mantra dalam satu perintah.
    public void ucapkanSemuaMantra() {
        System.out.println("Mantra milik " + nama + ":");

        // Mengulang setiap mantra yang telah dipelajari.
        for (MantraDunia mantra : daftarMantra) {
            mantra.efek();
        }
    }
}

// Kelas utama program.
public class DuniaSihir {

    public static void main(String[] args) {

        // Membuat objek penyihir Harry Potter.
        PenyihirDunia harry = new PenyihirDunia("Harry Potter");

        // Menambahkan tiga mantra yang dipelajari.
        harry.pelajariMantra(new ExpelliarmusDunia());
        harry.pelajariMantra(new LumosDunia());
        harry.pelajariMantra(new WingardiumLeviosa());

        // Menjalankan semua mantra dalam satu perintah.
        harry.ucapkanSemuaMantra();
    }
}




/*
PENJELASAN CARA KERJA PROGRAM:

Program ini membuat kelas abstrak MantraDunia sebagai dasar
untuk beberapa jenis mantra. Kelas ExpelliarmusDunia, LumosDunia,
dan WingardiumLeviosa memiliki implementasi method efek()
yang berbeda.

Kelas PenyihirDunia memiliki daftar untuk menyimpan mantra
yang dipelajari. Method pelajariMantra() digunakan untuk
menambahkan mantra ke dalam daftar tersebut.

Method ucapkanSemuaMantra() menggunakan perulangan untuk
menjalankan efek semua mantra yang telah dipelajari. Polymorphism
memungkinkan daftar yang sama menyimpan berbagai jenis mantra
dan menjalankan efek sesuai dengan objek masing-masing.
*/