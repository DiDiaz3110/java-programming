package day30IntroToArray;

public class FroEachLoopArray {
    public static void main(String[] args) {
// with array we always
// have Indexes        0    1   2    3   4    5   6    7    8   9
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        System.out.println("-------------FOR EACH LOOP------------");
        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        for(int n : data){
            System.out.print(n + " ");
        }
        //repeat above with for loop
        System.out.println("-------------FOR LOOP------------");
        for(int i =0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        //PRINT LAST VALUE IN ARRY USING LENGTH -1
        System.out.println("last value: " + data[data.length-1]);// because the length is 10 char,
        // but we have only 9 indexes. That's why we need to print -1

        //print all num backwards in the same line
        for(int idx = data.length - 1; idx >= 0; idx --){
            System.out.println(data[idx] + " ");
        }
    }
}
