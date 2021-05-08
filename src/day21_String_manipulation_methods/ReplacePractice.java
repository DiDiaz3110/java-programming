package day21_String_manipulation_methods;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase()); //GITHUB
        System.out.println(word.replace("hu","la"));//github ->gitlab
        System.out.println("word = " + word);// word = github, the above changes were temporary

        word = word.replace("hub", "lab"); //word = gitlab, the changes are permanently
        System.out.println("word = " + word);

        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);


        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun");
        System.out.println("sentence= " + sentence);

       String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over 4,000", "")
                       .replace(",", "")
                       .replace(" results for java book", "");
                       System.out.println(result);


    }
}
