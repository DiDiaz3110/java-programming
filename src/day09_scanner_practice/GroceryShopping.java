package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: ");
        double price1 = scan.nextDouble();
        System.out.println("Enter price for bread: ");
        double price2 = scan.nextDouble();
        System.out.println("Enter price for cucumber: ");
        double price3 = scan.nextDouble();
        double totalPrice = price1+price2+price3;
        System.out.println("Total price: "+totalPrice);
    }
    }




/*
public class Target {
public static void main(String[] args) {

        double milk = 3.99;
        double bread = 2.55;
        double cucumber = 4.10;
        double total = milk+bread+cucumber;

        System.out.println("Total = " + total);
 */





