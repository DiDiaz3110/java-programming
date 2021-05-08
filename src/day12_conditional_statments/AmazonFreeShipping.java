package day12_conditional_statments;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price: ");
        double totalPrice = scan.nextDouble();
        if(totalPrice >= 25.0) {
            System.out.println("Free shippping eligible. Your order total: $ " + totalPrice);
        } else {
            System.out.println("Not eligible for free shipping. Your order: $ "+totalPrice);
                    }
        System.out.println("Thank you for shopping with Amazon");
    }
}
