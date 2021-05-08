package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main (String []args) {
 System.out.println(10 / 3);
 System.out.println(5 /2);
 int num1 = 40;
 int num2 = 15;
 System.out.println(num1/num2);//2

        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);//2.5
double d1 = 12.0;
double d2 = 5.0;
System.out.println(d1/d2);//2.4

int count = 100;
double dCount = 30.0D;
System.out.println(count/dCount);//3.33333333

 //***********PRIMITIVE CASTING:************
 //*************PRIMITIVE CONVERSION***********
        int n1 = 4;
       // byte b1 = n1; THIS IS NOT GONNA WORK (NEEDS CAST IT), BECAUSE INT BIGGER THAT BYTE. SO BIG LUGGED COULD NOT BE PUT IN THE SMALL BUTE.

        byte b2 = 55;
        int n2 = b2;



    }
}
