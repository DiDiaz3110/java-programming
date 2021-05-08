package day22_String_manipulation_methods;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        //or
        System.out.println(result.substring(13));
        // or in order to find the index of:
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));// !!!!!

        System.out.println(result.substring(result.indexOf(":")));

        String today= "i learned [husky] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf ("]")));
    }
}
