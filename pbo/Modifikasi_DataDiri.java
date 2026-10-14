/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package pbo;

import java.util.Scanner;

/*
Nama  : Apostel Mangara Simatupang
NIM   : 41425010
Prodi : D4 Teknologi Rekayasa Perangkat Lunak
*/

public class Modifikasi_DataDiri {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean status = input.nextBoolean();

        int tinggiInt = (int) tinggi;

        System.out.println("\n=== DATA DIRI ===");
        System.out.println("Nama                   : " + nama);
        System.out.println("Umur                   : " + umur + " tahun");
        System.out.println("Tinggi badan           : " + tinggi + " cm");
        System.out.println("Status mahasiswa       : " + status);
        System.out.println("Tinggi setelah casting : " + tinggiInt + " cm");

        // Menutup Scanner
        input.close();
    }
}