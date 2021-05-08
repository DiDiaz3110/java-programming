package day10_shorthand_operators;
import java.util.Scanner;
public class RentValueGlitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rent payment amount and month: ");
        double rent = scan.nextDouble();
        scan.nextLine();//this is how you fix that BUG
        String month = scan.nextLine();
        System.out.println("My rent is " + rent);
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);


    }
}
