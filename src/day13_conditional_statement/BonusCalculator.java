package day13_conditional_statement;

public class BonusCalculator {

    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 900.55;

        if(salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
            System.out.println("bonus = " + bonus);
        } else {
            System.out.println("Great job, you qualified for full bonus!");
            bonus = 100;
            System.out.println("bonus = " + bonus);
        }
    }
}
