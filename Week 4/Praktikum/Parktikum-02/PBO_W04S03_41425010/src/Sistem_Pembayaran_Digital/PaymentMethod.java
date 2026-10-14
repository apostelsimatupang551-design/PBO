/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Pembayaran_Digital;

/**
 *
 * @author Apostel M Simatupang
 */
 
    public interface PaymentMethod {

    // Konstanta biaya admin.
    double ADMIN_FEE = 2500;

    // Method pembayaran yang wajib dibuat oleh class implementasi.
    void pay(double amount);
}

