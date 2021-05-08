package day19_class_vs_object_string;

import java.util.Locale;

public class StringCaseConversionMethods {
    public static void main(String[] args) {
        /*
        toLowerCase() -> converts all letters to lower case


        toUpperCase () -> converts all letters to upper case
         */
        String word = "CyberTek";
        String sentence = "JAVA IS FUN!";
        System.out.println(word.toLowerCase());//java
        System.out.println(sentence.toLowerCase());
        //or
        System.out.println("JAVA".toLowerCase());// you can not write System.out.println("JAVA"toLowerCase());
        System.out.println(word.toUpperCase());//JAVA

        word.toLowerCase();
        System.out.println(word);//CyberTek
        //but if
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInCase = " +wordInLcase);

        word = word.toLowerCase();// word assigned back //this also changes value of varialble permanently
        System.out.println("word =" + word);

String company = "Amazon WebServices";
        System.out.println(company.toLowerCase());
        System.out.println("company in uppercase - " + company.toUpperCase());

    }
}
