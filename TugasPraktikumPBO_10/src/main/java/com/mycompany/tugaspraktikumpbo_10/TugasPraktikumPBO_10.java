/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugaspraktikumpbo_10;

/**
 *
 * @author ACER
 */
public class TugasPraktikumPBO_10 {

    public static void main(String[] args) {

        Elektronik laptop = new Elektronik();
        Makanan roti = new Makanan();

        double hargaLaptop = 10000000;
        double hargaRoti = 25000;

        System.out.println
        ("Pajak Elektronik (Laptop): " + laptop.hitungPajak(hargaLaptop));
        System.out.println
        ("Pajak Makanan (Roti): " + roti.hitungPajak(hargaRoti));
    }
}
