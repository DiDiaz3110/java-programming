package day09_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 255;
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println("Cents = "+cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);

        //in 123 cents: 1 dollar 23 cents
        System.out.println("In "+cents+" cents: is "+dollars+" dollars "+remainingCents+" cents");


    }
}
