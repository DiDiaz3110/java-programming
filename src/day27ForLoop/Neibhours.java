package day27ForLoop;

public class Neibhours {
    public static void main(String[] args) {
        String word = "jaaavvaajjjjaaavvaaaspppproogramm";
        for (int index = 0; index < word.length() - 1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index + 1));
            if (word.charAt(index) == word.charAt(index + 1)) {
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}
//the word "jaavva" has "word.length" of 6 letters
//however, the positions are 0,1,2,3,4,5 and there is not a 6th position
//therefore, we need to tell it to stop at length-1 so it will stop at the 5th position