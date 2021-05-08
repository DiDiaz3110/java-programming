package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //equals() method - case sensative
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("CHICAGO"));// false
        System.out.println(city.equals("Chicago "));//false

        //equalsIgnoreCase() method - case insensative
        System.out.println(city.equalsIgnoreCase("Chicago"));//true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));// true
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));// true
        System.out.println(city.equalsIgnoreCase("Chiicago"));//false
        System.out.println(city.equalsIgnoreCase("Chicago "));//false because of space after Chicago
        /*
        STRING MANIPULATION
       ********** Equals() ************
       equals() -> compares Strings and returns true or false. It's case sensative
        String word = "java";
        sout(word.equals("java")); TRUE
        sout(word.equals("JAVA")); FALSE

        *******EqualsIgnoreCase()********
        equalsIgnoreCase() -> compares Strings and returns true or false. It is NOT case sensative!!!
         String word = "java";
        sout(word.equals("java")); TRUE
        sout(word.equals("JAVA")); TRUE
        sout(word.equals("Java"));TRUE
        sout(word.equals("ja va"));FALSE



                */
    }
}
