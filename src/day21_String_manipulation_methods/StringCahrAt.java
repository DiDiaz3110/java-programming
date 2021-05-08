package day21_String_manipulation_methods;

public class StringCahrAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));//j
        System.out.println(word.charAt(1));//a
        System.out.println(word.charAt(2));//v
        System.out.println(word.charAt(3));//a
       // System.out.println(word.charAt(4));//error
        System.out.println(word + "-" + word.length());//4

        String company = "Cybertek";
        //System.out.println("first letter: " + company.charAt(0));
                char first = company.charAt(0);
        //System.out.println("second letter: " + company.charAt(1));
                char second = company.charAt(1);
        //System.out.println("third letter: " + company.charAt(2));
                char third = company.charAt(2);
        //System.out.println("forth letter: " + company.charAt(3));
                char forth = company.charAt(3);
        //System.out.println("fifth letter: " + company.charAt(4));
                char fifth = company.charAt(4);
       //System.out.println("sixth letter: " + company.charAt(5));
                char sixth = company.charAt(5);
        //System.out.println("seventh letter: " + company.charAt(6));
                char seventh = company.charAt(6);
                char eighth = company.charAt(7);
            // ********* OR WE CAN DO THAT DIFFERENTLY ******
    System.out.println(first + " " + second + " " + third + " " + forth + " " + fifth +" " + seventh + " " + eighth);
    String withSpaces = (first + " " + second + " " + third + " " + forth + " " + fifth +" " + seventh + " " + eighth);
        System.out.println("withSpaces = " + withSpaces);


    }
    }

