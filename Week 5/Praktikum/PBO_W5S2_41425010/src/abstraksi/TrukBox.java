/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package abstraksi;

/*
 * NIM    : 41425010
 * Nama   : Apostel Mangara Simatupang
 * Prodi  : D4 Teknologi Rekayasa Perangkat Lunak
 */

 class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang + 
                           "' ke dalam kontainer tertutup pendingin.");
    }
}
