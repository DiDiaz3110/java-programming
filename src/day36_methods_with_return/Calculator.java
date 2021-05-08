package day36_methods_with_return;
import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        add(d1, d2);
        minus(d1, d2);
        divide(d1, d2);
        multiply(d1,d2);
        System.out.println("sum = " + add(d1, d2));
        System.out.println("minus = " + minus(d1, d2));
        System.out.println("Divide = " + divide(d1, d2));
        System.out.println("Multiply = " + multiply(d1, d2));
    }

       public static double add (double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    public static double minus(double num1, double num2) {
        double subtraction = num1 - num2;
        return subtraction;
    }

    public static double divide(double num1, double num2) {
        double quotient = num1 / num2;
        return quotient;
    }

    public static double multiply(double num1, double num2) {
        double multiplication = num1 * num2;
        return multiplication;
    }
}