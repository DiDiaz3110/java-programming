package day33_GroupFriends;

import java.util.Arrays;

public class SplitReview2 {
           public static void main(String[] args) {
            String word = "java";
            String[] strArr = word.split("");
            System.out.println(Arrays.toString(strArr));
               System.out.println(strArr[0]);
               System.out.println(strArr[1]);
               System.out.println(strArr[2]);
               System.out.println(strArr[3]);

               String word2 = "java1sql2html";
               String[] strArr2 = word2.split("\\d");
               System.out.println(Arrays.toString(strArr2));

//Split by numbers
               word2 = word2.replaceAll("\\d", "-");
               System.out.println(word2);

//Password matching!!!
               String password = "bcTd123_5";
               if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
                   System.out.println("Valid password");
               } else {
                   System.out.println("Invalid password");
               }
    }
}
