package day15_logicalops_switch_ternary;

import java.sql.SQLOutput;

public class NotLogicalOperator {
    public static void main(String[] args) {
        //!= -> is not equal comparison operator.
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. Age = " + age);
        } else {
            System.out.println("Can sit in normal seat. Age =" + age);
        }
        boolean isSmokingAllowed = true;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        } else {
            System.out.println("This area is for smoking");

            boolean isAffordable = false;
            if (!isAffordable) {
                System.out.println("Item is Not affordable");
            }
            String enviroment = "pa";
            if (!enviroment.equals("qa")) {
                System.out.println("In wrong enviroment for QA testing");
            }

            String carModel = "Honda";
            if (!carModel.equals("Tesla")) {
                System.out.println("I am not interested. Thank you");
            }
            String secretPassword = "abc123";
            String inputPassword = "123abc";
            if (!inputPassword.equals("abc123")) {
                System.out.println("The password is incorrect");
            }
            if (!inputPassword.equals(secretPassword)) {
                System.out.println("Correct password");
            } else {
                System.out.println("Incorrect password");
            }

        }
    }
}
