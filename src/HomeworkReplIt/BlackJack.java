package HomeworkReplIt;
import java.util.*;
public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int playerScore = scan.nextInt();
        int houseScore = scan.nextInt();

        if (playerScore > houseScore && playerScore <= 21) {
            System.out.println("player win");
        } else if (houseScore > playerScore && houseScore <= 21) {
            System.out.println("player loss");
        } else if (playerScore == houseScore) {
            System.out.println("its a tie");
        } else if (playerScore > 21) {
            System.out.println("player bust");
        }
    }
}
