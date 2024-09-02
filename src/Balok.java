/**
 * Balok
 */

public class Balok extends Kubus {
    int lebar;
    int tinggi;

    // Melakukan polimorfisme dari class Kubus
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Method menghitung volume dan luas permukaan
    public void volume() {
        int volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok = " + volume);
    }

    public void luasPermukaan() {   
        int luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Balok = " + luasPermukaan);
    }
}