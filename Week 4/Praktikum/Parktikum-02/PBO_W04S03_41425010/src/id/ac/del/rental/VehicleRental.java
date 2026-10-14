/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;


/*
 * Nama  : Apostel Mangara Simatupang
 * NIM   : 41425010
 * Prodi : DIV-Teknologi Rekayasa Perangkat Lunak
 *
 * Program utama untuk menguji sistem rental.
 */

/*
 * Hasil Diskusi Kelompok:
 * Menurut kelompok kami, class VehicleRental digunakan untuk
 * menyimpan data kendaraan dan menghitung biaya penyewaan.
 * Atribut dibuat private agar data kendaraan dan data biaya
 * tidak dapat diubah sembarangan dari class lain.
 */
public class VehicleRental {

    // Atribut kendaraan dibuat private untuk menerapkan encapsulation.
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;
    private double discountRate;

    /*
     * Hasil Diskusi Kelompok:
     * Constructor digunakan untuk memberikan nilai awal
     * berupa nomor plat dan harga sewa kendaraan.
     */
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;

        // Harga sewa tidak boleh bernilai negatif.
        if (rate > 0) {
            this.rentalRatePerDay = rate;
        } else {
            this.rentalRatePerDay = 0;
        }
    }

    /*
     * Hasil Diskusi Kelompok:
     * Method ini digunakan untuk menentukan jumlah hari sewa.
     * Kelompok kami memberikan validasi agar jumlah hari
     * tidak boleh bernilai 0 atau negatif.
     */
    public void setRentalDays(int days) {
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("Jumlah hari sewa harus lebih dari 0.");
        }
    }

    /*
     * Hasil Diskusi Kelompok:
     * Method ini digunakan untuk memberikan nilai diskon.
     * Nilai diskon dibatasi dari 0 sampai 1.
     * Contohnya 0.20 berarti diskon sebesar 20%.
     */
    public void setDiscountRate(double discount) {
        if (discount >= 0 && discount <= 1) {
            this.discountRate = discount;
        } else {
            System.out.println("Diskon harus berada antara 0 sampai 1.");
        }
    }

    /*
     * Hasil Diskusi Kelompok:
     * Getter digunakan untuk mengambil nomor plat karena
     * atribut plateNumber bersifat private.
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /*
     * Hasil Diskusi Kelompok:
     * Method ini digunakan untuk menghitung total biaya rental
     * setelah dikurangi dengan diskon.
     */
    public double getTotalCost() {
        double amount = rentalRatePerDay * rentalDays;
        double discount = amount * discountRate;

        return amount - discount;
    }

    /*
     * Hasil Diskusi Kelompok:
     * Method ini menggunakan interface Discountable sebagai
     * parameter. Dengan cara ini, jenis diskon dapat diganti
     * sesuai objek yang diberikan saat program dijalankan.
     */
    public double getTotalCost(Discountable discount) {

        double amount = rentalRatePerDay * rentalDays;

        // Menghitung jumlah potongan dari objek diskon.
        double discountAmount = discount.calculateDiscount(amount);

        // Mengembalikan total biaya setelah dikurangi diskon.
        return amount - discountAmount;
    }
}