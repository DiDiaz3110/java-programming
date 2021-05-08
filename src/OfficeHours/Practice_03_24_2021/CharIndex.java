package OfficeHours.Practice_03_24_2021;

public class CharIndex {
    public static void main(String[] args) {

        /*
        index of word:
                java is
                0123456//#4 is space

                charAt(number) - gives a char
                indexOf(char) - gives an int (index)
         */
       String s = "java";
        //System.out.println(s.charAt(s.length()));//StringIndexOfBoundsException - its mean you
        // trying to see index of character which is not exist

        System.out.println(s.charAt(s.length()-1));//a

        String upper = "" + s.toUpperCase().charAt(0) +s.charAt(3);
        System.out.println(upper);

        System.out.println(s.indexOf('a')); //index = 1 (from java
        System.out.println(s.indexOf('m'));

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "Contains": "Not contains");
        System.out.println(s.indexOf('g') >= 0 ? "Contains": "Not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        // boolean.String method
        System.out.println(s.toLowerCase().replace("j", "e").startsWith("a"));




    }
}
