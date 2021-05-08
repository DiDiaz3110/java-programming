package day09_scanner_practice;

public class RemainderOperator {
    public static void main(String[] args) {
        System.out.println(10/3);//3
        //3+3+3+1
        System.out.println(10 % 3);//1
        System.out.println(10/5);//2
        System.out.println(10%5);//5+5+0;

        System.out.println(20/7);//2 because there only 2 full 7's
        System.out.println(20%7);//6 which is remainder (7+7+6)
// but if you need clean full answer on (20/7), then write numbers in decimal
        System.out.println(20.0/7.0);



    }
}
