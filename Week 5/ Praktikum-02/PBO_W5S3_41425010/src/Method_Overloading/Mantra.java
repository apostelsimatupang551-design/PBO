/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overloading;

/**
 *
 * @author Apostel M Simatupang
 */
 
// Kelas Mantra untuk mempelajari method overloading.
public class Mantra {

    // Method pertama: mantra tanpa parameter.
    public void ucapkan() {
        System.out.println("Penyihir mengucapkan mantra.");
    }

    // Method kedua: menerima nama mantra.
    public void ucapkan(String namaMantra) {
        System.out.println("Mantra " + namaMantra
                + " berhasil diucapkan.");
    }

    // Method ketiga: menerima nama mantra dan target.
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mantra " + namaMantra
                + " diarahkan kepada " + target + ".");
    }

    // Method keempat: menerima nama mantra dan kekuatan.
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mantra " + namaMantra
                + " digunakan dengan kekuatan " + kekuatan + ".");
    }

    // Method kelima: urutan parameter berbeda.
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Penyihir menggunakan " + namaMantra
                + " dengan kekuatan " + kekuatan + ".");
    }

    // Method utama untuk menjalankan program.
    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        // Memanggil setiap versi method ucapkan().
        mantra.ucapkan();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", "Draco");
        mantra.ucapkan("Expelliarmus", 80);
        mantra.ucapkan(100, "Expelliarmus");
    }
}




/*

Program ini menerapkan method overloading, yaitu beberapa method
memiliki nama yang sama tetapi parameter yang berbeda.

Method ucapkan() dapat dipanggil tanpa parameter, menggunakan
nama mantra, menggunakan nama mantra dan target, atau menggunakan
nama mantra dan kekuatan.

Java akan memilih method yang sesuai dengan parameter yang
diberikan saat method dipanggil. Dengan cara ini, satu nama
method dapat digunakan untuk beberapa kebutuhan yang berbeda.
*/
