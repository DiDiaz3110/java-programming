package HomeworkReplIt;
import java.util.Scanner;
public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue1 = "";
        double price = 0;
        double totalPrice = 0;
        int count = 0;

        do {
            System.out.println("Enter Item-" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            count++;
           totalPrice += price;
            shoppingListReport += " Item" + count + ": " + item + " Price: " + price;

            System.out.println("Add one more item?");
            countinue1 = scan.next();
            if (countinue1 == ("yes")) {
                System.out.println("Enter Item" + count + " and its price:");
                count++;
                shoppingListReport += ", ";
            }
            }while (countinue1.equals("yes") && count <= 10) ;

            System.out.println(shoppingListReport);
            System.out.println("Total price:" + totalPrice);

        }
    }

/*
output:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
 */