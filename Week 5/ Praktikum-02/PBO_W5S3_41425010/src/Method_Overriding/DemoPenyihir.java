/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author Apostel M Simatupang
 */
 
// Kelas induk yang menjadi dasar semua penyihir.
class Penyihir {

    // Method yang dapat di-override oleh kelas anak.
    public void ucapkanMantra() {
        System.out.println("Penyihir mengucapkan mantra umum.");
    }
}

// Harry Potter memiliki cara mengucapkan mantra sendiri.
class HarryPotter extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan Expelliarmus!");
    }
}

// Hermione memiliki cara mengucapkan mantra sendiri.
class Hermione extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan Alohomora!");
    }
}

// Ron Weasley ditambahkan sesuai instruksi praktikum.
class RonWeasley extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan Wingardium Leviosa!");
    }
}

// Kelas utama untuk menguji overriding dan polymorphism.
public class DemoPenyihir {

    public static void main(String[] args) {

        // Referensi kelas induk dapat menunjuk objek kelas anak.
        Penyihir p1 = new HarryPotter();
        Penyihir p2 = new Hermione();
        Penyihir p3 = new RonWeasley();

        // Method yang berjalan sesuai objek sebenarnya.
        p1.ucapkanMantra();
        p2.ucapkanMantra();
        p3.ucapkanMantra();
    }
}



/*
PENJELASAN CARA KERJA PROGRAM:

Program ini menggunakan inheritance dan method overriding.
Kelas HarryPotter, Hermione, dan RonWeasley mewarisi kelas Penyihir.

Setiap kelas turunan memiliki method ucapkanMantra() dengan
implementasi yang berbeda. Ketika method dipanggil, program
menampilkan mantra sesuai dengan objek yang dibuat.

Polymorphism terlihat ketika variabel bertipe Penyihir digunakan
untuk menyimpan objek dari kelas turunan yang berbeda.
*/