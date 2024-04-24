public class Kucing {
    public String namaKucing = "caca";
    public int Lahir = 2020;
    public String jenis = "anggora";
    public String makanankesukaan = "ikan";
    public void DetailKucing() {
        System.out.println("Nama: " + this.namaKucing);
        System.out.println("Makanan: " + this.makanankesukaan);
        System.out.println("Tahun: " + this.Lahir);
    }

    public void jenis() {
        System.out.println("tipe: " + this.jenis);
    }

    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing();
        kucingSaya.DetailKucing();
        kucingSaya.jenis();
    }
}
