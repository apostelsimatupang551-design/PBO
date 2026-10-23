/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apostel M Simatupang
 */
public class UncaughtException {
    public static void main (String args[]) {
        System.out.println(3/0);
    }
    
}

//a. Analisis apa yang akan terjadi ketika program di atas di eksekusi. 
//=> 

// b. Apa outputnya? 
// hasil run:
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at UncaughtException.main(UncaughtException.java:12)
//C:\Users\M S I\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
//C:\Users\M S I\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
//BUILD FAILED (total time: 0 seconds)
