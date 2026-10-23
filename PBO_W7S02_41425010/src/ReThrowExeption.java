/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
 public class ReThrowException {
    static void demoThrow() {
        try {
            System.out.println(
                "I'm throwing an exception from demoThrow method"
            );

            throw new NullPointerException("demo");

        } catch (NullPointerException e) {
            System.out.println(
                "I'm catching the exception [" + e + "]"
            );

            System.out.println("But I'll throw it again...");

            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println(
                "I'm catching the exception [" + e
                + "] thrown from demoThrow method"
            );
        }
    }
}