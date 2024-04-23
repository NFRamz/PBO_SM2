import java.util.Scanner;

public class CheckingAccount {

    private double balance;
    private double nominal;
    private String name;
    Scanner inputUser = new Scanner(System.in);

//=====================SETTER================
    public void setbalance(double balance){
        this.balance = balance;
    }

    public void setname(String name){
     this.name = name;
    }

    //========================GETTER================
    public String getname(){
        return name;
    }
    public double getbalance(){

        return balance;
    }

    //================METHOD LAINNYA==========

    public void withdraw(){
        System.out.println("Masukkan jumlah uang:");
        nominal = inputUser.nextDouble();
        if(nominal <= balance ){
            balance = balance - nominal;
            System.out.println("Penarikan uang sebesar: Rp"+ nominal +" berhasil.");
            System.out.println("Sisa saldo: "+balance);


        }else{
            System.out.println("Saldo anda tidak cukup. ");

        }

    }

}
