/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author Apostel M Simatupang
 */
public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " C = " + fahrenheit + " F");

        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1f F = %.2f C%n", fahrenheit, celsius);
    }
}