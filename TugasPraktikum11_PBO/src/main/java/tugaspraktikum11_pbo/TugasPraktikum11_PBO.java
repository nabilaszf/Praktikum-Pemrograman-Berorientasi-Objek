/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugaspraktikum11_pbo;

/**
 *
 * @author ACER
 */
public class TugasPraktikum11_PBO {

    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        // Membuat buku
        Buku buku1 = new Buku("Bumi Manusia", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);

        // Membuat perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan info perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
