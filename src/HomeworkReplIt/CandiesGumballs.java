package HomeworkReplIt;
import java.util.*;
public class CandiesGumballs {
    public static void main(String[] args) {
        System.out.println("Enter number of coupons: ");
        Scanner scan = new Scanner(System.in);
        int coupons = scan.nextInt();
        int candyBars = coupons/10;
        int remainingCoupons = coupons%10;
        int gumballs = remainingCoupons/3;
                if (coupons < 3) {
            System.out.println("Not enough coupons");
        } else {
            System.out.println("Number of Candies:" + candyBars);
            System.out.println("Number of Gumballs:" + gumballs);
        }
    }
}