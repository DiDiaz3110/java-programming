package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:slenium:html";
        String [] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array is " + wordsArray.length);

        for(String each : wordsArray){
            System.out.println(each);
        }

       // String sentence = "today is Khan's birthday!";
    }
}
