package day40_ArrayList;

import java.util.*;

public class ArrayLIstLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//Polimorphic way of declaring
        System.out.println(nums);//[]  = it's empty
        System.out.println("size = " + nums.size());//0

        nums.add(34);
        nums.add(44);
        nums.add(34);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(34);
        nums.add(44);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(5);
        nums.add(845);
        nums.add(0);
        nums.add(500);
        nums.add(5);
        nums.add(845);
        nums.add(0);
        System.out.println("nums = " + nums);//nums = [34, 44, 34, 3, 88, 500]

        nums.remove(0);//removeing #34
        System.out.println("nums = " + nums);

        //nums.remove(88);// index out of BondsException
        nums.remove(new Integer(88));//removes num 88, not 88 index
        System.out.println("nums = " + nums);


        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);

        //for loop = iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

            //for each loop and print all in same line
            for (int each : nums) {//for(Integer each: nums)
                System.out.print(each + " ");


            }
        }
    }
}

