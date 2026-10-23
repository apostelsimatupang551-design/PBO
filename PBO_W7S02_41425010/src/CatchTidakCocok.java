/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class CatchTidakCocok {
    public static void main(String[] args) {
        int n = args.length;

        try {
            if (n == 0) {
                System.out.println(3 / n);
                System.out.println("This won't be executed");
            } else {
                System.out.println(
                    "This will be executed if arguments is not zero"
                );
            }
        } catch (NullPointerException e) {
            System.out.println("Menangkap error: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

 
 // Penjelasan:
// Program ini menghitung jumlah argumen yang dimasukkan saat dijalankan.
// Jika tidak ada argumen, nilai n adalah 0 sehingga pembagian 3 / n
// menyebabkan error karena angka tidak bisa dibagi dengan nol.
// Error tersebut adalah ArithmeticException, bukan NullPointerException,
// sehingga error tidak bisa ditangkap oleh catch yang ada.
// Meskipun terjadi error, blok finally tetap dijalankan dan menampilkan
// pesan "After trying or catching...".
// Setelah itu, program berhenti dan menampilkan pesan error karena
// tidak ada catch yang sesuai untuk menangani ArithmeticException.