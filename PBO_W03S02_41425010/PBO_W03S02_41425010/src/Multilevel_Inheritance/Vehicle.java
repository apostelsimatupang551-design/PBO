/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multilevel_Inheritance;

/**
 *
 * @author Apostel M Simatupang
 */

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

// Hilangkan kata 'public' agar tidak terjadi bentrok dengan nama file Vehicle.java
class Geeks {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}