/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_Mandiri2;

/**
 *
 * @author Apostel M Simatupang
 */
public class Main {

    public static void main(String[] args) {

        SmartLamp lampu = new SmartLamp(80);

        SmartAC ac = new SmartAC(24);

        System.out.println("=== SMART LAMP ===");

        // Mencoba koneksi ketika lampu masih mati.
        lampu.connectToWifi("Rumah_Apotel", "192.168.1.10");

        // Menyalakan lampu.
        lampu.turnOn();

        // Setelah menyala, koneksi WiFi berhasil.
        lampu.connectToWifi("Rumah_Apotel", "192.168.1.10");

        // Mematikan lampu.
        lampu.turnOff();

        System.out.println();

        System.out.println("=== SMART AC ===");

        // Menyalakan AC.
        ac.turnOn();

        // Menghubungkan AC ke WiFi.
        ac.connectToWifi("Rumah_Apotel", "192.168.1.11");

        // Mematikan AC.
        ac.turnOff();
    }
}

