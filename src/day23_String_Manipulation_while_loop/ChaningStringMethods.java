package day23_String_Manipulation_while_loop;

import java.util.Locale;

public class ChaningStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first, then print everything uppercase
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "HAYMARKET";
        System.out.println(city.substring(0,1).toUpperCase()+ city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+ city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //city.isEmpty.toUpperCase() Does not work since isEmpty is boolean


    }
}
