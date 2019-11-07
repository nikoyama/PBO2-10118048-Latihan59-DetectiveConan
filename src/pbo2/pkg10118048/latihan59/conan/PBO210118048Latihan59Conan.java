/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan59.conan;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan grup yang ada di serial conan
 */
public class PBO210118048Latihan59Conan {

    public static void main(String[] args) {
        
        Grup detective = new DetectiveCilik();
        Grup orgHitam = new OrganisasiHitam();
        
        detective.setGrup("Detektif Cilik");
        detective.tampilGrup();
        System.out.println("");
        orgHitam.setGrup("Organisasi Hitam");
        orgHitam.tampilGrup();
    }

}
