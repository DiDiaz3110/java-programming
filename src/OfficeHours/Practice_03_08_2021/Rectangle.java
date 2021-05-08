package OfficeHours.Practice_03_08_2021;
//Dynamic with scanner
import java.util.Scanner;
//PIC - Package-> Import -> Class

/*
   Make a class Rectangle
create a main method

- Declare two variables: length and width

    - Calculate the Perimeter 2(l*w)
    - Calculate the Area (w * l)

- Print properties of the Rectangle

- Modify to accept Scanner inputs
    */
public class Rectangle {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter your lenght: ");
double lenght = scan.nextDouble();//double lenght = scan.nextInt(); because Int smaller than Double
        System.out.println("Enter your wight: ");
double width = scan.nextDouble();
        double perimeter = 2 * (lenght + width);
        double area = lenght * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        //Hard coded values
         //  double lenght = 5;
         //  double width = 3;

  // double perimeter = 2 * (lenght + width);
   //double area = lenght * width;

       // System.out.println("perimeter = " + perimeter);
        // System.out.println("area = " + area);




    }
}
