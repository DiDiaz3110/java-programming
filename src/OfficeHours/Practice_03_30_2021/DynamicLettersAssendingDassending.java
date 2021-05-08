package OfficeHours.Practice_03_30_2021;
import java.util.Scanner;
public class DynamicLettersAssendingDassending {//восходящий или нисходящий алфавит
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want uppercase or lowercase?");
        String upperOrLower = scan.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = scan.next();
        int starting = 'A';
        int ending = 'Z';

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';

        } else {
            starting = 'a';
            ending = 'z';
        }
        if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }
    }
}