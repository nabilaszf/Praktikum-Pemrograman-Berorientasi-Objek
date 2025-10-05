/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author ACER
 */
public class Smartphone extends Produk {

    private double ukuranLayar; // dalam inci

    public Smartphone(String namaProduk, double harga, double ukuranLayar) {
        super(namaProduk, harga);
        this.ukuranLayar = ukuranLayar;
    }

    public double getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(double ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Layar: " + this.ukuranLayar + " inci");
    }
}
