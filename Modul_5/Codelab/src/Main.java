import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //===================================== MAIN Method =========================================
    public static void main (String[]args){
        System.out.println("\n==== Codelab Modul 5 ====");
        inputName();
        displayName();

    }
    //===========================================================================================

    //========================================= ATRIBUT =========================================
    static ArrayList<String> arrNama = new ArrayList<>();//Arralist untuk menyimpan nama.
    static Scanner inputUser = new Scanner(System.in);// Scanner untuk menerima input dari pengguna.


    //========================================== METHOD ======================================

    //Untuk masukkan input nama
    public static void inputName() {

                for (int i = 1; i > 0; i++) {//loop for yang dimulai dari i = 1 > 0 agar loop terus berjalan
                   System.out.print("-> Masukkan nama ke-" + i + ": ");
                   String nama = inputUser.nextLine();// untuk menerima input dari user

                   try {
                    if(nama.equals("selesai")) {
                        break;

                    } else if (nama.isEmpty()) {
                        i--;
                        throw new IllegalArgumentException("\n>>> Nama tidak boleh kosong! <<<\n");

                    } else {
                        arrNama.add(nama);

                    }
                 } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());

                   }
                }
    }

    //untuk menampilkan nama
        public static void displayName () {

            System.out.println("\n-> Daftar mahasiswa yang diinputkan:");
            for (Object i : arrNama) {
                System.out.println("- "+i);
            }
        }
}
