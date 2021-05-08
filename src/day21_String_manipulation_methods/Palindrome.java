package day21_String_manipulation_methods;

public class Palindrome {
    public static void main(String[] args) {
        String word = "wow";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last) {
            System.out.println("first and last letter match!");
        }else{
            System.out.println("first and last letter mismatch!");
        }
        if(word.charAt(0) == word.charAt(2)){
            System.out.println("first and last letter match!");
        }else{
            System.out.println("first and last letter mismatch!");
        }
        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() -1);
        // or in 2 steps***** Обязательно нужно переделать String into int, because index and length
        // переводят value of word into int
        //1. int count = friend.length();
        //2. char lastLetter = friend.charAt(count -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if(firstLetter == lastLetter){
            System.out.println(friend + "first and last letter match!");
        }else{
            System.out.println(friend + "first and last letter mismatch!");
        }
    }
}
