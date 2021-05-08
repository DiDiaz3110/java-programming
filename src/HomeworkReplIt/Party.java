package HomeworkReplIt;
import java.util.*;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */
public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestList = "";
        String answ = "";
        String guestName = "";

        do {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            guestList += guestName;
            System.out.println("Do you want to enter new guest name:");
            answ = input.next();

            if (answ.equalsIgnoreCase("yes")) {
                guestList += ", ";
            }
        } while (answ.equalsIgnoreCase("yes"));

        System.out.println("Guest's list: " + guestList);
    }
}





//guestList += " " + moreGuests;
//!answ.equalsIgnoreCase("no")










