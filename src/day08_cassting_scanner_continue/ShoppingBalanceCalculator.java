package day08_cassting_scanner_continue;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
       double InitialBalance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;

        double remainingBalance = InitialBalance - (price1+ price2+ price3);//or
        //double remainingBalance = InitialBalance - price1 - price2 - price3);
        System.out.println("Your initial balance: $" +InitialBalance);
        System.out.println("Remaining balance: $"+ remainingBalance);

        //balanceWithNoCents
        int balanceWithNoCents = (int) 219.68;
       //or int balanceWithNoCents = (int)remainingBalance;
        System.out.println("You remaining balance without cents: $"+balanceWithNoCents);

        //*******IMPLICIT CASTING*****
              //  byte, short, int, long
                byte num1 =10;
                short num2 = num1;
               //from small to bigger number no need to cast, it happens authomatically/IMPLICIT

                short num3 = 3456;
                int num4 = num3;

                int num5= 3453456;
                long num6 = (long)num5;
    }


    }

