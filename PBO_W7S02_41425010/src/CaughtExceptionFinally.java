/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class CaughtExceptionFinally {
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
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class CaughtExceptionFinally {
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
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}


// a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya?
// =>
// Jika program dijalankan tanpa arguments, nilai n adalah 0.
// Akibatnya, pembagian 3 / 0 menyebabkan ArithmeticException.
// Error tersebut ditangkap oleh catch dan pesan error ditampilkan.
// Setelah itu, blok finally tetap dijalankan dan menampilkan
// pesan "After trying or catching...".


// b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?
// =>
// Jika program dijalankan dengan arguments, nilai n lebih dari 0.
// Program menampilkan pesan "This will be executed if arguments is not zero".
// Karena tidak terjadi error, blok catch tidak dijalankan.
// Namun, blok finally tetap dijalankan dan menampilkan
// pesan "After trying or catching...".


// c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program.
// =>
// Kesimpulannya, tanpa arguments program mengalami error karena pembagian
// dengan nol. Dengan arguments, program berjalan normal karena pembagian
// dengan nol tidak dilakukan. Blok catch hanya dijalankan jika terjadi
// exception, sedangkan blok finally tetap dijalankan baik terjadi error
// maupun tidak.