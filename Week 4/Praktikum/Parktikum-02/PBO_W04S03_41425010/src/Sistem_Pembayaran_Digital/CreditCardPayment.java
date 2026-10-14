/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Pembayaran_Digital;

/**
 *
 * @author Apostel M Simatupang
 */
 
    public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        double total = amount + ADMIN_FEE;

        System.out.println("=== CREDIT CARD ===");
        System.out.println("Harga       : Rp" + amount);
        System.out.println("Biaya Admin : Rp" + ADMIN_FEE);
        System.out.println("Total       : Rp" + total);
        System.out.println("Pembayaran Credit Card berhasil.");
    }
}

