package day09_scanner_practice;

public class SalaryCalculator {
    public static void main (String[]args){
        double hourlyRate = 54.5;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12; //or weeklyPay * 4;
        double annualPay = monthlyPay * 12;
        System.out.println("Enter hourly rate:");



        System.out.println("WeeklyPay: " + weeklyPay);
        System.out.println("MonthlyPay: " + monthlyPay);
        System.out.println("AnnualPay: " + annualPay);
    }
}
//you have the double hourlyRate twice, once in the beginning and later after the hourly rate message
//double hourlyRate = 54.5; is declared twice. either remove the first line or don't include the datatype for the 2nd time