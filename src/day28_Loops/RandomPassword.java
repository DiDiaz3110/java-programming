package day28_Loops;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";//"" - which is 0

        for (int i = 0; i <= 8; i++) {
            int index = random.nextInt(71);//random num 0-70
            System.out.print(source.charAt(index));

            //add the char to password variable using +=
            password = password + source.charAt(index);// => same as: password += source.charAt(index);
            //System.out.println(random.nextInt(20));
           // System.out.println(random.nextInt(source.length()));


        }
        System.out.println("\nYour password = " + password);
    }
}
