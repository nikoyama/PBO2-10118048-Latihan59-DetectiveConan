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
public class DetectiveCilik extends Grup{ 

    @Override
    public void tampilGrup() {
        System.out.println("-----ANGGOTA " + getGrup().toUpperCase() + "-----");
        System.out.println("1. Conan Edogawa"
                + "\n2. Ai Habara"
                + "\n3. Genta Kojima"
                + "\n4. Ayumi Yoshida"
                + "\n5. Mitsuhiko Tsuburaya");
    }
   
}
