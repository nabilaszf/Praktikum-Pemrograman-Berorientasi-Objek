/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TugasPraktikum5;

/**
 *
 * @author ACER
 */
public class TugasPraktikum5_PBO {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.jenis = "Kucing Anggora";
        System.out.println("=== Data Kucing ===");
        kucing.tampilkanInfo();
        System.out.println();

        // Objek Anjing
        Anjing anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.jenis = "Anjing Bulldog";
        System.out.println("=== Data Anjing ===");
        anjing.tampilkanInfo();
        System.out.println();

        // Objek Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 120;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        System.out.println("=== Data Mobil ===");
        mobil.tampilkanInfo();
        System.out.println();

        // Objek Sepeda Motor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Honda Vario";
        motor.kecepatan = 80;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "Mesin 4-tak";
        System.out.println("=== Data Sepeda Motor ===");
        motor.tampilkanInfo();
    }
}
