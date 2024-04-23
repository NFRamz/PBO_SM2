import java.util.Scanner;

public class SavingsBond extends  CheckingAccount{

    private int term;
    private double deposit;
    private double interestRate;

    Scanner inputUser = new Scanner(System.in);

    public SavingsBond(){


    }    public SavingsBond(String name, double balance, int term) {

        super.getname();
        super.getbalance();
        this.term = term;
        switch ((term-1)/12) {
            case 0:
                this.interestRate = 0.005;
                break;
            case 1:
                this.interestRate = 0.010;
                break;
            case 2:
                this.interestRate = 0.015;
                break;
            case 3:
                this.interestRate = 0.020;
                break;
            case 4:
                this.interestRate = 0.025;
                break;
            default:
                this.interestRate = 0;
                System.out.println("Maksimal 60 hari !");

        }
    }

    public void viewDetailInfo(){

        System.out.println("Nama    : " + super.getname());
        System.out.println("Saldo   : " + super.getbalance());
        System.out.println("Durasi  : " + term + " bulan");
        System.out.println("Suku Bunga: " + interestRate * 100 + "%");

    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    public void setTerm(int term){
        this.term = term;
    }
    public double getDeposit(){
        return deposit;
    }
    public int getTerm(){
        return term;
    }
}
