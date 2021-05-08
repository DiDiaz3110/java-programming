package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //++, --

        int num1 = 1;
        num1++;
        ++num1;
        System.out.println("num11 = " + num1);

        int num2 = 5;
        num2--;
        --num2;
        System.out.println("num12 = " + num2);

        //PRE INCREMENT ++ (it means increase by 1)
        int num10 = 20;
        int num20 = ++num10;
        System.out.println("num10 = " + num10);//21
        System.out.println("num20 = " + num20);//21

        //POST INCREMENT -- (it means decrease by 1)
        int num11 = 4;
        int num12 = num11++;
        System.out.println("num11 = " + num11);//5
        System.out.println("num12 = " + num12);//4

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi =15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println("sedans = " + sedans);

        int myNumber = 44;
        myNumber ++;
        System.out.println("myNumber = " + myNumber);//45
       ++myNumber;
        System.out.println("myNumber = " + myNumber);//46

        //add first, then print
        myNumber = 20;
        System.out.println(++myNumber);//21

        //print first, then add 1
        myNumber = 33;
        System.out.println("myNumber = " + myNumber++);//33
        System.out.println("myNumber = " + myNumber);//34
//just follow the pluses. On the left then its first increase

        int a = 5;
        int b =4;
        int c = a++ + ++b;

        a = 50;
        b = 22;
        c = 50+23;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
