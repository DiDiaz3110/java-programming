package day19_class_vs_object_string;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassWord = "Abc123";

        String userName = "CYBTEK";
        String password = "Abc123";
        if (expUserName.equalsIgnoreCase(userName) && expPassWord.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - Incorrect Username");
            } else {
                if (!expPassWord.equals(password)) {
                    System.out.println("Fail - Incorrect password");
                }
            }

        }
    }
}

