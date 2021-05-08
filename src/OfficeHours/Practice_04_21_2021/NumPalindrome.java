package OfficeHours.Practice_04_21_2021;

public class NumPalindrome {
    public static void main(String[] args) {
    }
        public static boolean isPalindrome(int number){

            while (number != 0) {
                System.out.println("last digit" + number % 10);
                number /= 10; // number = number / 10;
                System.out.println("number after /10 " +number);
                System.out.println();
            }
            return false;
        }



}
