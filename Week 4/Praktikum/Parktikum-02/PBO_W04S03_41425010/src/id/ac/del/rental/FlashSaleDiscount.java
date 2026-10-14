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
 * Class FlashSaleDiscount digunakan untuk memberikan
 * diskon ketika terdapat program Flash Sale.
 * Class ini juga mengikuti aturan dari interface Discountable.
 */
public class FlashSaleDiscount implements Discountable {

    /*
     * Hasil Diskusi Kelompok:
     * Menurut kelompok kami, diskon Flash Sale ditentukan
     * sebesar 20% dari total biaya rental.
     */
    @Override
    public double calculateDiscount(double amount) {

        // Menghitung diskon sebesar 20%.
        return amount * 0.20;
    }
} 
