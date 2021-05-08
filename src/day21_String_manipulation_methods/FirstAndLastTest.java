package day21_String_manipulation_methods;

public class FirstAndLastTest {
    public static void main(String[] args) {
        // *******INDEX OF *******
        String word = "github project";
        System.out.println(word.indexOf("g"));//0
        System.out.println(word.indexOf("u"));//4

        System.out.println(word.indexOf("java")); // if it cannot find, it gives -1
        System.out.println(word.indexOf("t"));// if there multiple 't' letter, then, it gives only for first one

    }
}
