import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myAge;

        System.out.print("Masukkan Umur:");
        myAge = input.nextInt();
        if (myAge >= 16) {
            System.out.println("I'm old enough to have a driver's license!");
        }else{
            System.out.println("I'm not old enough yet... :*");
        }
    }
}


