package day19_class_vs_object_string;

public class LengthOfTheString {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.length());//4

        String name = "Nadir";
        System.out.println(name.length());//5

        String name1 = "Dinara";
        System.out.println(name1);
        System.out.println(name1.length());
        System.out.println("count: " + name1.length());

        System.out.println("wooden spoon".length());//space is a character
        String firstName = "Dinara";
        System.out.println(firstName + "-" + firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);


        String password = "abc123";
        /*
        if Statement:
        when password is at least 6 characters:
        print: valid amazon password
        else
        print: password too short
                 */

        if(password.length()>=6) {
            System.out.println("Password is good!");
        }else{
            System.out.println("Password is incorrect");

            }

        }
    }

