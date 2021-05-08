package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollarsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();//int cents = 255
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println("Cents = "+cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);

        //in 123 cents: 1 dollar 23 cents
        System.out.println("In "+cents+" cents: is "+dollars+" dollars "+remainingCents+" cents");


    }
}
