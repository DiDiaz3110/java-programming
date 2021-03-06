package OfficeHours.Practice_05_03_2021;
import java.util.*;
public class CheckingTheLetter {

    public static void main(String[] args) {
/*
Count Letters (Similar to Target word, but different layer)
Given an ArrayList of Strings and a letter (char) print how many times the
letter is found in the ArrayList elements
Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”letter: ‘a’Output:6
 */




        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word" ));
        char targetLetter = 'j';

        int count = 0;

//        for(String word: words){
//            for(int i=0; i < word.length(); i++) {
//                if(word.charAt(i) == targetLetter) {
//                    count++;
//                }
//            }
//        }

        for(String word: words){
            count += letterInWord(word, targetLetter);
        }

        System.out.println(targetLetter + " was found " + count + " times");

    }

//    public static int letterInWord(String word, char target) {
//        int count = 0;
//        for(int i=0; i < word.length(); i++) {
//            if(word.charAt(i) == target) {
//                count++;
//            }
//        }
//        return count;
//    }


    public static int letterInWord(String word, char target) {
        int count = 0;
        for(char each : word.toCharArray()){
            if(each == target) count++;
        }
        return count;
    }
}