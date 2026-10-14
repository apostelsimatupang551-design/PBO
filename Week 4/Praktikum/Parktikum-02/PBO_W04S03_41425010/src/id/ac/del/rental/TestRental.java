 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package id.ac.del.rental;
/*
 * Nama  : Apostel Mangara Simatupang
 * NIM   : 41425010
 * Prodi : DIV-Teknologi Rekayasa Perangkat Lunak
 *
 * Program utama untuk menguji sistem rental.
 */

  
import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.CorporateDiscount;

/*
 * Hasil Diskusi Kelompok:
 * Class TestRental digunakan untuk menjalankan dan menguji
 * sistem rental kendaraan yang sudah dibuat.
 * Pada class ini kami mencoba beberapa jenis diskon
 * menggunakan referensi dari interface Discountable.
 */
public class TestRental {

    public static void main(String[] args) {

        /*
         * Hasil Diskusi Kelompok:
         * Kami membuat objek VehicleRental dengan nomor plat
         * BK 1234 DEL dan harga sewa Rp250.000 per hari.
         */
        VehicleRental v = new VehicleRental(
                "BK 1234 DEL",
                250000
        );

        /*
         * Hasil Diskusi Kelompok:
         * Kendaraan disewa selama 7 hari.
         * Method setter digunakan agar nilai rentalDays
         * tidak dapat diubah secara langsung.
         */
        v.setRentalDays(7);

        /*
         * Hasil Diskusi Kelompok:
         * Kami membuat objek MemberDiscount dengan tipe
         * referensi Discountable. Hal ini menunjukkan
         * penggunaan polymorphism pada interface.
         */
        Discountable member = new MemberDiscount();

        // Menghitung total biaya dengan diskon member 10%.
        double totalMember = v.getTotalCost(member);

        // Menampilkan hasil biaya rental untuk member.
        System.out.println("Total Member: Rp" + totalMember);

        /*
         * Hasil Diskusi Kelompok:
         * Selanjutnya kami menggunakan jenis diskon Flash Sale.
         * Objek tetap disimpan menggunakan tipe Discountable.
         */
        Discountable flashSale = new FlashSaleDiscount();

        // Menghitung total biaya dengan diskon Flash Sale 20%.
        double totalFlashSale = v.getTotalCost(flashSale);

        // Menampilkan hasil biaya rental Flash Sale.
        System.out.println("Total Flash Sale: Rp" + totalFlashSale);

        /*
         * Hasil Diskusi Kelompok:
         * Terakhir kami menggunakan CorporateDiscount.
         * Ini membuktikan bahwa satu interface dapat digunakan
         * untuk beberapa jenis implementasi diskon.
         */
        Discountable corporate = new CorporateDiscount();

        // Menghitung total biaya dengan diskon corporate 15%.
        double totalCorporate = v.getTotalCost(corporate);

        // Menampilkan hasil biaya rental corporate.
        System.out.println("Total Corporate: Rp" + totalCorporate);
    }
}