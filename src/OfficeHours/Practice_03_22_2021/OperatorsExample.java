package OfficeHours.Practice_03_22_2021;

public class OperatorsExample {
    public static void main(String[] args) {
        int a=3,b=2;
        long c = (a-- +b)* 2 /3 % 2;
        //        (3-- +2) * 2/3  % 2; ->*,/,and % are on the same level for work on them
        //        5 * 2/3  % 2;
        //        10/3  % 2;
        //        3  % 2;
        //        1 - leftover.

        //a = 2, b = 2, c = 1
        short c2 = (short)((a-- +b)* 2 /3 % 2);
// Example casting to short
    }
}
