package OfficeHours.Practice_04_06_2021;

public class LongestSubstringFikrat {
    public static void main(String[] args) {
        String str="aaabbbcccccddddeeeeeeeeee";
        String longest ="";
        String temp = "";

        for (int i = 0; i < str.length()-1; i++) {
            temp += str.charAt(i);
            if(str.charAt(i) != str.charAt(i+1) || i == str.length()-2){
                if(temp.length()>longest.length()){
                    longest = temp;
                }
                temp ="";
            }

        }
        System.out.println("Longest substring: " + longest);
    }
    }

