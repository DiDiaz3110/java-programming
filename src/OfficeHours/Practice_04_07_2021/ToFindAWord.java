package OfficeHours.Practice_04_07_2021;

public class ToFindAWord {
    public static void main(String[] args) {
        /*
        Given a String of words that follow Camel Case convention. Find and
print how many words are in the given String.
Every word, except the first word, begin with an uppercase letter. The
other characters of the word will be lowercase
Ex:
Input: thisHasManyWordsToFind
         */
                          String str = "aaabbbcccccddddeeeeeeeeeee";
                String longestSubstring= "";
                String temp = "";  //
                for(int i=0; i< str.length()-1; i++) {
                    temp += str.charAt(i); //
                    if (str.charAt(i) != str.charAt(i + 1) || i == str.length() - 2) {

                        if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                            temp += str.charAt(i + 1);
                        }
                        if (temp.length() > longestSubstring.length()) {
                            longestSubstring = temp;
                        }
                        temp = "";
                    }
                }

                System.out.println("Longest substring: "+ longestSubstring);
            }
        }