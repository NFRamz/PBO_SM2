import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        SavingsBond objSavingBond = new SavingsBond();
        CheckingAccount objCheckingAccount = new CheckingAccount("Naufal", 50000);

        System.out.println("Nama    : " + objCheckingAccount.getName());
        System.out.println("Saldo   : Rp." + objCheckingAccount.getBalance());

        System.out.println("==== MENU ====\n1. Witdrawal \n2. Deposit\n Pilih menu: ");
        int pilihan = inputUser.nextInt();
        switch(pilihan){
            case 1:
                objCheckingAccount.withdraw();

            case 2:
                objSavingBond.viewDetailInfo(objCheckingAccount.getName(), objCheckingAccount.getBalance());

            default:
                System.out.println("Pilih 1-3");

        }
    }
}

