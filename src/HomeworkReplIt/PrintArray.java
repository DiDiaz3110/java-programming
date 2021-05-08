package HomeworkReplIt;

import java.util.*;

public class PrintArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        for(int j =0; j <=arr.length -2; j++){
            System.out.println(arr[j] + ", " + arr[j+1] + ", " + arr[j+2]);
        }
            //System.out.println(Arrays.toString(arr));


//            System.out.println(arr[0] +", " + arr[1] + ", " + arr[2]));
//
        //

//        String line1 = (arr[0] + arr[1] + arr[2]);
//       // String joinedStr = String.join(", ", line1);
//        System.out.println(String.join(", ", line1));
//        System.out.println(arr[1] + arr[2] + arr[3]);
//        System.out.println(arr[2] + arr[3] + arr[4]);
//        System.out.println(arr[4] + arr[5] + arr[6]);





    }
}

