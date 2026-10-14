/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;
/**
 *
 * @author Apostel M Simatupang
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Class Student harus mengimplementasikan Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(
                       new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
            System.out.println("Objek berhasil diserialisasi.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(
                       new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println("Hasil Deserialisasi: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}