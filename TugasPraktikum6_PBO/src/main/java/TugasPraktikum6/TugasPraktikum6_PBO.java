/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package TugasPraktikum6;

/**
 *
 * @author ACER
 */
public class TugasPraktikum6_PBO {

    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Java Programming", 200000));
        keranjang.tambahProduk(new Elektronik("Laptop", 2500000));
        keranjang.tambahProduk(new Pakaian("Cardigan", 50000));

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}
