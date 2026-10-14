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
 * Class CorporateDiscount digunakan untuk pelanggan
 * dari perusahaan atau pelanggan corporate.
 * Class ini mengimplementasikan interface Discountable.
 */
public class CorporateDiscount implements Discountable {

    /*
     * Hasil Diskusi Kelompok:
     * Menurut kelompok kami, pelanggan corporate
     * mendapatkan diskon sebesar 15%.
     */
    @Override
    public double calculateDiscount(double amount) {

        // Menghitung diskon sebesar 15%.
        return amount * 0.15;
    }
}