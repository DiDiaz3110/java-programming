package day22_String_manipulation_methods;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";

        System.out.println(word.substring(0, 4));//java
        System.out.println(word.substring(0, 7));//java is
        System.out.println(word.substring(5, 7));//is
        System.out.println(word.substring(8, 11));//fun
// to do evaluation of the characters => put the Stop, Debug, Evaluation...
        System.out.println(word.substring(8));//fun
    }
}