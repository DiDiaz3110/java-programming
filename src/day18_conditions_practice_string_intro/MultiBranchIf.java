package day18_conditions_practice_string_intro;

import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
           if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else { //if(number == 0)
               System.out.println( number + " is zero");
        }
    }
}
