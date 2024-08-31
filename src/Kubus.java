public class Kubus{
    int panjang;

    public Kubus(int panjang) {
        this.panjang = panjang;
    }

    public void volume() {
        int volume = panjang * panjang * panjang;
        System.out.println("Volume Kubus = " + volume);
    }

    public void luasPermukaan() {
        int luasPermukaan = 6 * (panjang * panjang);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }
}
