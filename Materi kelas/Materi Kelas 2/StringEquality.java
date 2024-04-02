import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a;

        a = input.nextLine();

        if(a.equals("Moe")){
            System.out.print("You are the king");
        }else{
            System.out.print("you not kiing");
        }
    }
}

