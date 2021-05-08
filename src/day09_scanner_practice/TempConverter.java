package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);
        System.out.println("*******Temperature converter from F to C *********");
        System.out.println("Enter temperature in F: ");
        double tempInForenheit = input.nextDouble();
        //double tempInForenheit = scan.nextDouble();
        //scan = input = keyboard = or anything else like 'i'
        double tempInCelcius = (tempInForenheit-32)*5/9;
        System.out.println(tempInForenheit+" F in C: "+tempInCelcius);
        Scanner close;

    }
}
