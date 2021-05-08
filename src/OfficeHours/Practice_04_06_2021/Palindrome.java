package OfficeHours.Practice_04_06_2021;

public class Palindrome {
    public static void main(String[] args) {
        //Q What if your String has a million characters look and check if it is Palindrome?)
        String word = "anena";
       boolean isPalindrome = true;

       for(int i =0; i < word.length()/2; i++){
           if(word.charAt(i) != word.charAt(word.length()-1-i)){
               isPalindrome = false;
               break;
           }
       }
        System.out.println(isPalindrome);


//if(word.charAt(i) != word.charAt(word.length()-1)){ - to check only first and last letters

    }
}
