package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;

/*
Multiple Words
Given a String of words that are separate by commas.
Find and print any words that have more than one word
Example
Input:
Output:
wooden spoons
trash can
dish washer
 */
public class MultipleWords {
    public static void main(String[] args) {


        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer";
        String[] arrWords = words.split(", ");
        System.out.println(Arrays.toString(arrWords));

        for (String eachWord : arrWords) {//or you can do like this for(String eachWord : words.split(", ")){
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }

        }
    }
}