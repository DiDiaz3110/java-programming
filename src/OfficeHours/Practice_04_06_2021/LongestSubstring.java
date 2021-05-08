package OfficeHours.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        /*
        Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
         */

        String str ="abcdeea";
        String longestSubstring ="";
        String temp ="";
        for(int i =0;i<str.length()-1;i++){
            temp+=str.charAt(i);

            if((str.charAt(i)!=str.charAt(i+1))||i==str.length()-2){
                if(temp.length()>longestSubstring.length()){
                    longestSubstring=temp;
                }
                temp="";
            }
        }
        System.out.println("longest substring "+longestSubstring);
    }
}
