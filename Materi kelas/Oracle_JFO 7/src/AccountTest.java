import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        CheckingAccount objCheckingAccount = new CheckingAccount();
        SavingsBond objSavingBond = new SavingsBond();

        objCheckingAccount.setname("Naufal");
        objCheckingAccount.setbalance(100000);

        System.out.println("Nama    : " + objCheckingAccount.getname());
        System.out.println("Saldo   : " + objCheckingAccount.getbalance());

        System.out.println("==== MENU ====\n1. Witdrawal \n2. Deposit\n Pilih menu: ");
        int pilihan = inputUser.nextInt();
        switch(pilihan){
            case 1:
                objCheckingAccount.withdraw();

            case 2:

            default:

        }





        }
    }

