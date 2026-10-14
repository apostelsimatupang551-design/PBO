/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

 import java.util.Scanner;

/**
 * Nim  : 41425010
 * Nama : Apostel M Simatupang
 * Motto: if at first you don t succeed, call it version 1.0
 */
public class ShoppingCart {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan daftar belanja
        String[] daftarBelanja = new String[100];

        // Menyimpan jumlah item saat ini
        int jumlahItem = 0;

        int pilihan;

        do {

            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");

            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    // Menambahkan item baru
                    if (jumlahItem >= daftarBelanja.length) {

                        System.out.println("Daftar belanja sudah penuh.");

                    } else {

                        System.out.print("Masukkan item: ");
                        String item = input.nextLine();

                        daftarBelanja[jumlahItem] = item;
                        jumlahItem++;

                        System.out.println(
                            item + " berhasil ditambahkan!"
                        );
                    }

                    break;

                case 2:

                    // Mengecek apakah ada item
                    if (jumlahItem == 0) {

                        System.out.println("Daftar belanja kosong.");

                    } else {

                        System.out.print(
                            "Hapus item pada posisi: "
                        );

                        int posisi = input.nextInt();

                        // Posisi dimulai dari 1
                        if (posisi < 1 || posisi > jumlahItem) {

                            System.out.println("Posisi tidak valid.");

                        } else {

                            String itemDihapus =
                                    daftarBelanja[posisi - 1];

                            // Menggeser item setelah item yang dihapus
                            for (int i = posisi - 1;
                                    i < jumlahItem - 1;
                                    i++) {

                                daftarBelanja[i] =
                                        daftarBelanja[i + 1];
                            }

                            jumlahItem--;

                            daftarBelanja[jumlahItem] = null;

                            System.out.println(
                                itemDihapus + " berhasil dihapus!"
                            );
                        }
                    }

                    break;

                case 3:

                    // Menampilkan seluruh item
                    if (jumlahItem == 0) {

                        System.out.println("Daftar belanja kosong.");

                    } else {

                        System.out.println("Daftar belanja:");

                        for (int i = 0; i < jumlahItem; i++) {

                            System.out.println(
                                (i + 1) + ". " + daftarBelanja[i]
                            );
                        }
                    }

                    break;

                case 4:

                    // Mencari item
                    System.out.print("Cari item: ");
                    String cari = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlahItem; i++) {

                        if (daftarBelanja[i].equalsIgnoreCase(cari)) {

                            System.out.println(
                                cari + " ditemukan pada posisi "
                                + (i + 1)
                            );

                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(
                            cari + " tidak ditemukan."
                        );
                    }

                    break;

                case 5:

                    System.out.println("Terima kasih!");
                    break;

                default:

                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}

