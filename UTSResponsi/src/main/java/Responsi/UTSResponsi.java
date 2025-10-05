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

        System.out.println("===== POLIMORFISME PRODUK =====");

        Produk produk1 = new Elektronik("Laptop ASUS ROG", 25000000, 2);

        Produk produk2 = new Smartphone("Samsung Galaxy S25", 18000000, 6.8);

        System.out.println("--- Info Produk 1 (Elektronik) ---");
        produk1.tampilkanInfo();

        System.out.println("\n--- Info Produk 2 (Smartphone) ---");
        produk2.tampilkanInfo();

        System.out.println("\n=========================================\n");
        System.out.println("===== POLIMORFISME PEGAWAI =====");

        Pegawai pegawai1 = new PegawaiTetap("Andi Wijaya", 6000000, 2000000);
        Pegawai pegawai2 = new PegawaiKontrak("Rina Sari", 4500000, 12);

        System.out.println("--- Info Pegawai 1 (Pegawai Tetap) ---");
        pegawai1.tampilkanInfo();

        System.out.println("\n--- Info Pegawai 2 (Pegawai Kontrak) ---");
        pegawai2.tampilkanInfo();
    }
}
