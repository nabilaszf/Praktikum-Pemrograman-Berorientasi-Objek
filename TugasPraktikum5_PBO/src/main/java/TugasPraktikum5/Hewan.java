/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author ACER
 */
public class Hewan {

    String nama;
    String jenis;

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
    }
}

class Kucing extends Hewan {

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Meong-meong");
    }
}

class Anjing extends Hewan {

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Guk-guk");
    }
}
