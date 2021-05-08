package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();//comp generates random # for us = sout(random.nextInt(101))
        Scanner scan = new Scanner(System.in);

        // 101 its until what num+1
        // System.out.println(randomNum.nextInt(101));

        int secretNum = randomNum.nextInt(101);//or any num which i choose
        int guessingNum = 0;
        do {
            System.out.println("Guess the secret number");
            guessingNum = scan.nextInt();
            if (guessingNum > secretNum) {
                System.out.println("Wrong, your num is too large");
            } else if (guessingNum < secretNum) {
                System.out.println("Wrong, your num is too small");
            }
        }while (guessingNum != secretNum) ;
            System.out.println("Congrats, you won! secret num is: " + secretNum);
    }
}


