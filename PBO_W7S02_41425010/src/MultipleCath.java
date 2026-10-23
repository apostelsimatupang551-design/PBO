/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
  class MultipleCatch {
    public static void main(String[] args) {
        int n = args.length;
        int a = 1;
        int[] c = new int[1];

        try {
            if (n == 0) {
                a = a / (a - 1);
            } else {
                c[21] = 5;
            }
        } catch (ArithmeticException e) {
        // } catch (Exception e){ 
            System.out.println(
                "Ups, seem out we have an Arithmetic Exception here..."
        // System.out.println
          //("Ups, seem out we have an Arithmetic Exception here..."); 
            );
        } catch (Exception e) {
        //} catch (ArithmeticException e){ 
            System.out.println(
                "Let the other exception handler here..."
        // System.out.println("Let the other exception handler here..."); }
            );
        }
    }
}


 // a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi?
// => Catch ArithmeticException dieksekusi karena terjadi pembagian dengan nol
//    pada a / (a - 1), sehingga menghasilkan ArithmeticException.


// b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi?
// => Catch Exception dieksekusi karena program mencoba mengakses indeks
//    c[21], sedangkan array hanya memiliki satu elemen. Akibatnya, terjadi
//    ArrayIndexOutOfBoundsException yang ditangani oleh catch Exception.

//c. Sekarang, ganti ArithmeticException dengan Excception sepeti yang ditunjukkan di 
// bawah ini:
// } catch (Exception e)
//     { System.out.println("Ups, seem out we have an Arithmetic Exception 
//   here..."); 
//  } catch (ArithmeticException e){ 
//    System.out.println("Let the other exception handler here..."); } 

