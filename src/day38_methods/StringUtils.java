package day38_methods;

import java.util.Locale;

public class StringUtils {
        public static void main(String[] args) {

        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

        public static boolean isNullOrEmpty(String str) {
            //or like this
            //return (str == null || str.isEmpty());

            if (str == null || str.equals("")) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
        public static String reverse(String word){
            String str = "";
                for(int i = word.length()-1; i>=0; i--){
                    str += word.charAt(i);
                }
                return str;
            }
    }

/*
- if (str.isEmpty || word == null
){ → this will give NullPointerException
- if(word == null || word.isEmpty()) { → this will be true, NO ERROR
- if(word == null | word.isEmpty()) { → this will give NullPointerException
because you are using one pipe which forces the program to check both sides
 */