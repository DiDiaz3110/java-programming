package day33_GroupFriends;
import java.util.*;
public class ReverseArray2 {
    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap");

        int temp = nums[0];
        nums[0] = nums[3];
        nums[0] = temp;
        System.out.println("after 1st and last swap: " + Arrays.toString(nums));


        int[] num2 = {5, 10, 4, 100};
        System.out.println("before: " + Arrays.toString(num2));
        for (int i = 0; i < num2.length / 2; i++) {
            int temp2 = num2[i]; //put int temp
            num2[i] = num2[num2.length - 1 - i];
            num2[num2.length - 1 - i] = temp2;
        }
        System.out.println("after : " + Arrays.toString(num2));

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("Before reverse words = " + Arrays.toString(words));
        for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) {
            String tempWords = words[i];
            words[i] = words[j];
            words[j] = tempWords;
        }
        System.out.println("Words after reverse = " + Arrays.toString(words));

    }
}
/*
here is code with explanation:
System.out.println("before swap " + Arrays.toString(nums));
        int temp = nums [0];  //just made temp equal
        to first index, so 5, nothing changes in array yet
        nums[0] = nums [3];  // now we changed value
        of first index to the last, so 5 became 100
        nums[3] = temp;     //now we changed value
        of last index to be equal to first (through temp, so 100 became 5
 */