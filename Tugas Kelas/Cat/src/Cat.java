import java.time.Year;

public class Cat {
    public String nama = "riki";
    public String jeniskelamin = "perempuan";
    public String favoritefood = "sosis";
    public int tahunlahir = 2022;
    public int bulanlahir = 2;
    public int tanggallahir = 23;

    public void displaycat() {
        System.out.println("Nama :" + this.nama);
        System.out.println("Jenis kelamin :" + this.jeniskelamin);
        System.out.println("Makanan favorit :" + this.favoritefood);
        System.out.println("Tanggal lahir: " + this.tanggallahir + "/" + this.bulanlahir + "/" + this.tahunlahir);
    }

    public int usia() {
        int tahunsekarang = Year.now().getValue();
        return tahunsekarang - this.tahunlahir;
    }

    public static void main(String[] args) {
        Cat kucing = new Cat();
        kucing.displaycat();
        System.out.print("Usia sekarang: " + kucing.usia() + " tahun");
    }
}
