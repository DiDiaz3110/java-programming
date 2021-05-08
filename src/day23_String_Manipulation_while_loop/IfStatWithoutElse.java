package day23_String_Manipulation_while_loop;

public class IfStatWithoutElse {
    public static void main(String[] args) {
//        int i = 1;
//        if (i <= 5) {
//            System.out.println(i);
//        }
        //above is if Stat with condition, it will run from top to bottom and will check
        // the condition ONCE. Then print value of i -> 1
        //Then you can do While loop - which gonna repeat
        //while loop
        //while loop  - similar to if statement, it checks if condition is true, and runs while loop block code. And it will keep
//        int i1 = 1;
//        while (i1 <= 25) {
//            System.out.println(i1);
//            i1++;
//        }
        int apples = 0;
        while(apples <= 10){
            System.out.println("apples = " + apples);
        apples++;
        }
        System.out.println("apples = " + apples);
    }
}