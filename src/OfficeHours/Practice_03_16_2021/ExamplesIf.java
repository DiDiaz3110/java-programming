package OfficeHours.Practice_03_16_2021;

public class ExamplesIf {
    public static void main(String[] args) {
        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        //       10 * 2 - 8 % 2 + 8;
        //       20 - 8 % 2 + 8; // 8 devided by 2, what is a remainder = 0 (9%2=>9/2=>2+2+2+2==remainder 1)
        //       20 - 0 + 8;
        //       20 + 8;
        //       28
    }
}
