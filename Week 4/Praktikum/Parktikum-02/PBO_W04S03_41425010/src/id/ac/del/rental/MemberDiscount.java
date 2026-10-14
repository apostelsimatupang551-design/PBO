/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author Apostel M Simatupang
 */

 

/*
 * Hasil Diskusi Kelompok:
 * Class MemberDiscount digunakan untuk jenis diskon
 * khusus pelanggan yang merupakan member.
 * Class ini mengimplementasikan interface Discountable.
 */
public class MemberDiscount implements Discountable {

    /*
     * Hasil Diskusi Kelompok:
     * Menurut kelompok kami, pelanggan member mendapatkan
     * diskon sebesar 10% dari total biaya rental.
     */
    @Override
    public double calculateDiscount(double amount) {

        // Menghitung diskon sebesar 10%.
        return amount * 0.10;
    }
}

