/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Keamanan_Rekening_Bank;

/**
 *
 * @author Apostel M Simatupang
 */
public class BankAccount {
   
    // Atribut dibuat private agar tidak dapat diubah langsung dari luar class.
    private String rekening;
    private double saldo;

    // Constructor untuk membuat rekening baru.
    public BankAccount(String rekening, double saldoAwal) {
        this.rekening = rekening;

        // Saldo awal tidak boleh negatif.
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh negatif.");
        }
    }

    // Getter untuk membaca nomor rekening.
    public String getRekening() {
        return rekening;
    }

    // Getter untuk membaca saldo.
    public double getSaldo() {
        return saldo;
    }

    // Method untuk melakukan setor tunai.
    public void deposit(double jumlah) {

        // Jumlah setor harus lebih besar dari 0.
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil: Rp" + jumlah);
        } else {
            System.out.println("Error: Jumlah deposit harus positif.");
        }
    }

    // Method untuk melakukan penarikan.
    public void withdraw(double jumlah) {

        // Jumlah penarikan harus positif.
        if (jumlah <= 0) {
            System.out.println("Error: Jumlah penarikan harus positif.");
        } 
        // Penarikan tidak boleh melebihi saldo.
        else if (jumlah > saldo) {
            System.out.println("Error: Saldo tidak mencukupi.");
        } 
        else {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil: Rp" + jumlah);
        }
    }
}

