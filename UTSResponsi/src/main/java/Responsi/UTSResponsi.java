/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Responsi;

/**
 *
 * @author ACER
 */
public class UTSResponsi {

     public static void main(String[] args) {

        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop ASUS", 8500000, 2);
        laptop.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai");
        PegawaiTetap pegawai1 = new PegawaiTetap("Nabila Syafiqah", 5000000, 1000000);
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("3. Output Polimorfisme");
        Produk produk = new Makanan("Roti Coklat", 15000, "2025, 12, 1");
        Pegawai pegawai = new PegawaiKontrak("Raka", 3000000, 12);

        produk.tampilkanInfo();
        System.out.println();
        pegawai.tampilkanInfo();
    }
}
