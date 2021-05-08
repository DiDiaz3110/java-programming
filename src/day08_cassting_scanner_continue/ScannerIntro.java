package day08_cassting_scanner_continue;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please print your name:");

        String firstName = scan.next();
        System.out.println("Nice to meet you, "+firstName);

    }
}
