package day40B_ReviewClass;
public class CountLetters {
    /*

    [Count Letters]

    Create a method that will accept a String and print how many times each characters is found in the String

    Ex:
        Input:
            "apple tree"
        Output:
            a - 1
            p - 2
            l - 1
            e - 3
              - 1  (space char)
            t - 1
            r - 1
     */
    public static void main(String[] args) {
        countLetters("apple tree");
    }
    public static void countLetters(String str) {
        String checked = "";


        for (int i = 0; i < str.length(); i++) {
            char checkEachLetter = str.charAt(i);
            int count = 0;//we need to delare it inside loop,
            // so it's gonna обнуляться для каждой буквы отдельно

            if (!checked.contains("" + checkEachLetter)) {

                for (int j = 1; j < str.length(); j++) {//because it is
                // gonna check all letters against first letter and etc
                char checkEachOtherLetter = str.charAt(j);

                if (checkEachLetter == checkEachOtherLetter) {
                    count++;
                }
            }
            System.out.println(checkEachLetter + " - " + count);
           //or like this: checked += checkEachLetter + " ";
            checked += checkEachLetter;
        }
        }
    }
}
