package HomeworkReplIt;
import java.util.Scanner;
public class Bedrooms {
    public static void main(String[] args) {
                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
                // Variables are already declared and given
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to Cybertek Apartments!");
                System.out.println("Number of bedrooms you are interested:");

                int numberOfBedrooms = scan.nextInt();
                int startingPrice = 0;
                int price1 = 1100;
                int price2 = 1850;
                int price3 = 2550;

                if(numberOfBedrooms == 1){
                    System.out.println("One Bedroom Selected \n" + "Starting Price: " + price1);
                }else if(numberOfBedrooms == 2){
                    System.out.println("Two Bedroom Selected \n" + "Starting Price: " + price2);
                }else if(numberOfBedrooms == 3){
                    System.out.println("Three Bedroom Selected \n" + "Starting Price: " + price3);
                }else {
                    System.out.println(numberOfBedrooms);
                    System.out.println ("No such Bedrooms available");
                }
            }
        }

