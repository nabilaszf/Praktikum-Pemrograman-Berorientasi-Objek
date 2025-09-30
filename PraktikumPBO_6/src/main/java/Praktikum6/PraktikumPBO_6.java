/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Praktikum6;

/**
 *
 * @author ACER
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara();           // Output: Meow
        kucing.makan("ikan");        // Output: Hewan makan ikan
        kucing.makan("ikan", 2);     // Output: Hewan makan 2 porsi ikan

        Hewan anjing = new Anjing();
        anjing.bersuara();           // Output: Woof
        anjing.makan("daging");      // Output: Hewan makan daging
        anjing.makan("daging", 3);   // Output: Hewan makan 3 porsi daging
    }
}
