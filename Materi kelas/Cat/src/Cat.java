public class Cat {
    public String nama = "riki", jeniskelamin = "perempuan", favoritefood = "sosis";
    public int tahunlahir = 2022, bulanlahir = 2, tanggallahir = 23;

    public void displaycat() {
        System.out.println("Nama :"+nama);
        System.out.println("Jenis kelamin :" +jeniskelamin);
        System.out.println("Makanan favorit :" +favoritefood);
        System.out.println("Tanggal lahir: " +tanggallahir+ "/" +bulanlahir + "/" +tahunlahir);


    }
    public static void main(String[] args) {
    Cat kucing = new Cat();
    kucing.displaycat();

    }
}