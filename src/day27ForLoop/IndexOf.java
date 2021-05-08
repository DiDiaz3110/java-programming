package day27ForLoop;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'T';
        int index = -1;
        //using For loop

        for (int n = 0; n < word.length(); n++) {
            // System.out.println(n + " - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter + " is found at index " + index);
                break;//it's to exit the loop, return is more powerful.
                //if you have any code after the loop, then do NOT type RETURN

            }
        }
        if (index == -1) {
            System.out.println(letter + " is not present");

//        }else{
//            System.out.println(letter + " is found at index " + index);
//        }
        }
    }
}
//index = should be -1, because 0 is already a first letter
// we need to store value in index, so we can use that value outside of the Loop.