package day19_class_vs_object_string;

public class StartSWITCH {
    public static void main(String[] args) {
       // String startSwitch() Проверяет, находит слова начинающиеся на определенную букву. It is also Case sensative.
        String word = "selenium";
        System.out.println(word.startsWith("s"));//true
        System.out.println(word.startsWith("selen"));//true

        //******** ENDSWITH String method
        // It checks if a String value ends with a certain String. and returns BOOLEAN (true/false)

        String word1 = "Bishkek";
        System.out.println("Bishkek".startsWith("B")); //true
        //or
        System.out.println(word1.startsWith("B")); //true
        System.out.println(word1.startsWith("ish"));//false
        System.out.println(word1.startsWith("ke"));// false
        System.out.println(word1.endsWith("ek"));// true

        String name = "Irina";
        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");

        String name5 = "Mrs. Diaz";
            if (name5.startsWith("Mr.")){
                System.out.println("Man");
            } else if (name5.startsWith("Dr.")){
                System.out.println("Doctor");
            }else if (name5.startsWith("Mrs.")){
                System.out.println("Married Woman");
            }else if (name5.startsWith("Ms.")){
                System.out.println("Single Women");
            }else if (name5.startsWith("Sr.")){
                System.out.println("Senior");
            }else{
                System.out.println("Just regular name");
            }
            /* String url = "https://www.stackoverflow.com"
            .com - commercial website
            .ru - Russian
            .gov - government
            .edu - education
            .org - organization
             */
            String url = "dinara.com";
            if(url.endsWith(".com")){
                System.out.println("Commercial");
            }else if (url.endsWith(".ru")){
                System.out.println("Russian website");
            }else if (url.endsWith(".gov")){
                System.out.println("Government website");
            }else if (url.endsWith(".edu")){
                System.out.println("Education website");
            }else if (url.endsWith("org")){
                System.out.println("Organization website");
            }

        }
    }
}
