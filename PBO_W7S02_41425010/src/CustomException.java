/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}

public class CustomException {

    static void periksaUmur(int umur)
            throws UmurTidakValidException {

        if (umur < 17) {
            throw new UmurTidakValidException(
                "Umur minimal 17 tahun."
            );
        }

        System.out.println("Umur memenuhi syarat.");
    }

    public static void main(String[] args) {
        try {
            periksaUmur(15);
        } catch (UmurTidakValidException e) {
            System.out.println(
                "Terjadi kesalahan: " + e.getMessage()
            );
        }
    }
}
