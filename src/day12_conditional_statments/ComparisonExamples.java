package day12_conditional_statments;
public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed==speedLimit);
        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit>currentSpeed);

        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed+" mph");
        System.out.println("speedLimit = " + speedLimit+" mph");

        currentSpeed += 20;
        isSpeeding = currentSpeed>speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford it? " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >=itemPrice;
        System.out.println("Can afford = "+canAfford);

        accountBalance -= itemPrice;// or acountBalance = accountBalance - itemPrice;
        System.out.println("accountBalance: "+ accountBalance);

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);


    }
}
