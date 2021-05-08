package OfficeHours.Practice_04_14_2021;
import java.util.*;
/*
Given a String array. Find the longest Palindrome String in your array.
Ex: Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
Output: racecarEx:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]Output: No palindrome
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic",  "apple",  "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for(String word : words) {

            boolean isPalindrome = true;

            for(int i=0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome && word.length() > longestPalindrome.length()){
                longestPalindrome = word;
            }

        }

        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);
    }
}
