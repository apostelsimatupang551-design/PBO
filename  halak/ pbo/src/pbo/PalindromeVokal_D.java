/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package pbo;

import java.util.Scanner;

/*
Nama  : Apostel Mangara Simatupang
NIM   : 41425010
Prodi : D4 Teknologi Rekayasa Perangkat Lunak
*/
public class PalindromeVokal_D {

    public static void main(String[] args) {

        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Meminta input kata atau kalimat
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Mengubah kata menjadi huruf kecil
        String teks = kata.toLowerCase();

        // Mengecek palindrome
        String terbalik = "";

        for (int i = teks.length() - 1; i >= 0; i--) {
            terbalik += teks.charAt(i);
        }

        // Menampilkan hasil pengecekan palindrome
        if (teks.equals(terbalik)) {
            System.out.println("Kata tersebut adalah palindrome.");
        } else {
            System.out.println("Kata tersebut bukan palindrome.");
        }

        // Menghitung jumlah huruf vokal
        int jumlahVokal = 0;

        for (int i = 0; i < teks.length(); i++) {

            char huruf = teks.charAt(i);

            // Mengecek apakah karakter merupakan huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    || huruf == 'e' || huruf == 'o') {

                jumlahVokal++;
            }
        }

        // Menampilkan jumlah huruf vokal
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        // Menutup Scanner
        input.close();
    }
}