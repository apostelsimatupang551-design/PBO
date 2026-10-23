/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println(
            "I'm throwing a non Runtime exception that I don't handle"
        );

        System.out.println(
            "Without specifying in method declaration"
        );

        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}


// a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
// => Program mengalami error karena IllegalAccessException merupakan checked
//    exception yang harus ditangani menggunakan try-catch atau dideklarasikan
//    dengan throws pada method. Jika tidak ditangani atau dideklarasikan,
//    program akan mengalami compile-time error.


// b. Apa yang akan terjadi jika IllegalAccessException diganti dengan ArithmeticException? Mengapa?
// => Program dapat dikompilasi tanpa harus menggunakan try-catch atau throws
//    karena ArithmeticException merupakan unchecked exception.
//    Namun, jika terjadi kesalahan aritmetika saat program dijalankan,
//    program dapat menghasilkan ArithmeticException.


// Perbaikan kode program:
// => Tambahkan try-catch untuk menangani exception atau gunakan throws
//    pada deklarasi method agar IllegalAccessException ditangani dengan benar.