/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_Mandiri2;

/**
 *
 * @author Apostel M Simatupang
 */
 
    public class SmartLamp implements Switchable, Connectable {

    // Atribut dibuat private.
    private int brightness;
    private boolean isOn;

    // Constructor.
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    // Menyalakan lampu.
    @Override
    public void turnOn() {

        isOn = true;

        System.out.println("Smart Lamp dinyalakan.");
    }

    // Mematikan lampu.
    @Override
    public void turnOff() {

        isOn = false;

        System.out.println("Smart Lamp dimatikan.");
    }

    // Menghubungkan lampu ke WiFi.
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // Tidak boleh konek jika perangkat mati.
        if (!isOn) {
            System.out.println(
                "Error: Smart Lamp harus dinyalakan sebelum terhubung WiFi."
            );
            return;
        }

        System.out.println("Smart Lamp berhasil terhubung ke WiFi.");
        System.out.println("SSID : " + ssid);
        System.out.println("IP   : " + ipAddress);
    }
}

