/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_Mandiri2;

/**
 *
 * @author Apostel M Simatupang
 */
    public class SmartAC implements Switchable, Connectable {

    // Suhu dan status dibuat private.
    private double temperature;
    private boolean isOn;

    // Constructor.
    public SmartAC(double temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    // Menyalakan AC.
    @Override
    public void turnOn() {

        isOn = true;

        System.out.println("Smart AC dinyalakan.");
    }

    // Mematikan AC.
    @Override
    public void turnOff() {

        isOn = false;

        System.out.println("Smart AC dimatikan.");
    }

    // Menghubungkan AC ke WiFi.
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // AC tidak boleh terhubung ketika mati.
        if (!isOn) {
            System.out.println(
                "Error: Smart AC harus dinyalakan sebelum terhubung WiFi."
            );
            return;
        }

        System.out.println("Smart AC berhasil terhubung ke WiFi.");
        System.out.println("SSID : " + ssid);
        System.out.println("IP   : " + ipAddress);
    }
}

