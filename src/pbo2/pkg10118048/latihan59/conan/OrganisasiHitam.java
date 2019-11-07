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
public class OrganisasiHitam extends Grup{
    
    @Override
    public void tampilGrup() {
        System.out.println("-----ANGGOTA " + getGrup().toUpperCase() + "-----");
        System.out.println("1. Big Boss"
                + "\n2. Gin"
                + "\n3. Vodka"
                + "\n4. Vermouth"
                + "\n5. Chianti"
                + "\n6. Korn"
                + "\n7. Bourbon"
                + "\n8. Rum"
                + "\n9. Kichiro Numabuchi");
    }

}
