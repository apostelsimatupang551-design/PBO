/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Pembayaran_Digital;

/**
 *
 * @author Apostel M Simatupang
 */
 
  public class Main {

    public static void main(String[] args) {

        // Referensi menggunakan tipe interface.
        PaymentMethod payment;

        // Menggunakan E-Wallet.
        payment = new EWalletPayment();
        payment.pay(100000);

        System.out.println();

        // Menggunakan Credit Card.
        payment = new CreditCardPayment();
        payment.pay(100000);
    }
}

