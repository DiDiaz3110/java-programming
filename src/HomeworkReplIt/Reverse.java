package HomeworkReplIt;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};
        for(int i = 0; i < nums.length /2; i++){
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;

            int temp2 = nums[0+1];
            nums[0+1] = nums[nums.length - 2];
            nums[nums.length - 2] = temp2;

            int temp3 = nums[0+2];
            nums[0+2] = nums[nums.length - 3];
            nums[nums.length - 3] = temp3;
        }
        System.out.println(Arrays.toString(nums));

    }
}


//        int reversedOrder = 0;
//        for (int i = 0; i < nums.length / 2; i++) {
//            reversedOrder += nums[i] + " ";
//            Arrays.reverseOrder(nums[0], nums[6]);
//            //Do not change below statement:
//            System.out.println(Arrays.toString(nums));

//
//      for (int i = 0; i < num2.length / 2; i++) {
//          int temp2 = num2[i]; //put int temp
//          num2[i] = num2[num2.length - 1 - i];
//          num2[num2.length - 1 - i] = temp2;
//      }
//      System.out.println("after : " + Arrays.toString(num2));
//
//                int temp = nums[0];
//                nums[0] = nums[6];
//                nums[6] = temp;
//
//                reversed += words[i] + " ";
//                Arrays.reverseOrder(nums[0], nums[6]);
//                System.out.println(Arrays.toString(nums));
//
//
//                int temp = nums[0 + 1];
//                nums[0] = nums[6 - 1];
//                nums[6 - 1] = temp;
//            }
