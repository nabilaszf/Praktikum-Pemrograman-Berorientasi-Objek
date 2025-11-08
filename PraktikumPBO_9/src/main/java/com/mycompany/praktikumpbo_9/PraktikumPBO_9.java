/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_9;

/**
 *
 * @author ACER
 */
public class PraktikumPBO_9 {

    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan motor = new Motor();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        motor.berjalan();
        motor.info();
    }
}
