package day35_methods_with_param;
import java.util.*;

public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter 2 doubles: ");
        //showSum(10.45, 55.10);
        //or
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);
    }
    public static void showSum(double num1, double num2) {
    double sum = num1 + num2;
        System.out.print("The sum is " + sum);
        }
    }
