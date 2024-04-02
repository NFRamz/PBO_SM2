import java.util.Scanner;

public class Admin {
    private static final Scanner scanner = new Scanner(System.in);
    private static void tambahDataMahasiswa() {
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        long nim;
        while (true) {
            try {
                System.out.print("NIM Mahasiswa (maksimal 15 angka): ");
                nim = Long.parseLong(scanner.nextLine());
                if (String.valueOf(nim).length() == 15 && nim > 0) {
                    break;
                } else {
                    System.out.println("NIM harus terdiri dari 15 angka.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
            }
        }

        System.out.print("Jurusan Mahasiswa: ");
        String jurusan = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
        daftarMahasiswa.add(mahasiswa);

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }
}
