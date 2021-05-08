package HomeworkReplIt;
import java.util.*;
public class Has55 {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
                for(int i = 0; i<nums.length-2; i++){// but if you do <= then
                    if(nums[i] == 5 && nums[i+1] == 5){
                        System.out.println(true);
                        return;
                    }
                }
                System.out.println(false);
            }
}
