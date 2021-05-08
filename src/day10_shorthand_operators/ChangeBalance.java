package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;

        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("Balance after baklava = $" + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("Balance after kenafa = $" + balance);

        kenafa = 44.45;
        kenafa = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;

        System.out.println("Balance and 2 kenafa = $" + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("Balance after plov = $" + balance);

        double iceTea = 3.00;
        System.out.println("iceTea = " + iceTea);
        //buy 4 ice tea and decrease balance
        balance = balance - (iceTea * 4);
        System.out.println("Balance after 4 Iced teas = $" + balance);

//return baklava
        System.out.println("Returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("Balance after returning baklava = $" + balance);
    }
}
