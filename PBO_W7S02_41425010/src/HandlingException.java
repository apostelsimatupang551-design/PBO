/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex);
        }
    }
}


// a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk
// mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya.
// =>
// Jika menggunakan ex.getMessage(), program menampilkan pesan "/ by zero"
// yang menjelaskan penyebab error.
// Jika menggunakan ex.getStackTrace(), program mendapatkan informasi
// lokasi terjadinya error. Informasi ini dapat ditampilkan menggunakan
// System.out.println(java.util.Arrays.toString(ex.getStackTrace())).
// Jika menggunakan ex.printStackTrace(), program menampilkan jenis error,
// pesan error, dan lokasi terjadinya error pada kode.

// b. Ganti ArithmeticException dengan Exception. Apa hasilnya? Jelaskan.
// =>
// Program tetap dapat menangani error pembagian dengan nol.
// Hal ini karena ArithmeticException merupakan turunan dari Exception.
// Exception lebih umum sehingga dapat menangani berbagai jenis exception.