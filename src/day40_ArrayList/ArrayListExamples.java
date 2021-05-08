package day40_ArrayList;
import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
       // nums.add("java");ERROR

        System.out.println("size = "+nums.size());

        //reading from ArrayList
        System.out.println("index 0 = " + nums.get(0));//to get Index(0);
        System.out.println("index 1 = " + nums.get(1));//to get Index(1);
        System.out.println("index 2 = " + nums.get(2));//to get Index(2);
       // System.out.println("index 3 = " + nums.get(3));//outOfBoundExept

        //Capacity = how many ArrayList could hold //How many ppl can seat in airplane
        //Size =  how many actually values are there // how many ppl actually on that airplane

        //print all values in same line:
        System.out.println(nums);//Arrays.toString(numArray);
       // System.out.println(Arrays.toString(numArray));not like this


        // to REMOVE
        nums.remove(1);//remove element at index 1

        System.out.println(nums);








    }
}
