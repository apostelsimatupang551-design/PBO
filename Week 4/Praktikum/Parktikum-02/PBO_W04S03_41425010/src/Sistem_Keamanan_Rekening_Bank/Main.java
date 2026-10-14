/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Keamanan_Rekening_Bank;

/**
 *
 * @author Apostel M Simatupang
 */
public class Main {
  
    public static void main(String[] args) {

        // Membuat rekening dengan saldo awal Rp1.000.000.
        BankAccount rekening = new BankAccount(
                "1234567890",
                1000000
        );

        System.out.println("=== SISTEM REKENING BANK ===");
        System.out.println("Nomor Rekening : " + rekening.getRekening());
        System.out.println("Saldo Awal     : Rp" + rekening.getSaldo());

        // Melakukan deposit.
        rekening.deposit(500000);

        // Melakukan withdraw.
        rekening.withdraw(250000);

        // Mencoba withdraw melebihi saldo.
        rekening.withdraw(2000000);

        // Mencoba deposit dengan nilai negatif.
        rekening.deposit(-50000);

        System.out.println("Saldo Akhir    : Rp" + rekening.getSaldo());
    }
}

