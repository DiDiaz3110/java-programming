package day33_GroupFriends;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] strArr = word.split("a");
        System.out.println(Arrays.toString(strArr));
        int countOfA = strArr.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
            System.out.println("countOfA = " + countOfA);
    }
}
//Note; DO NOT use this approach to count occurences of character or String in a string. When Split value ends