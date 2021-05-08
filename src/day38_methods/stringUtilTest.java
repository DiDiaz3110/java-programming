package day38_methods;
/*
 * import all static methods. so that you can just call by method name, without classname
 */
public class stringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//        return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

//  ???  String word = "java";
//    String revWord = stringUtilTest.reverse(word);
//System.out.println("word = "+revWord);




/*
public static boolean isPalindrome(String str2) {
        boolean palindrome = true;
        for (int i = 0; i < str2.length()/2 ; i++) {
            if(str2.toLowerCase().charAt(i) != str2.toLowerCase().charAt(str2.length() - 1 - i)) {
                palindrome = true;
            }
        }
        return palindrome;

    }
}

String str = "civic";
       if(StringUtils.isPalindrome(str)) {
           System.out.println("This is a palindrome word");
       } else {
           System.out.println("This is not a palindrome word");
       }
    }
}
 */