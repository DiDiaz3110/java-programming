package OfficeHours.Practice_03_29_2021;
import java.util.Scanner.*;
public class Sandwich {
    public static void main(String[] args) {
    /*
    A sandwich is two pieces of bread with something in between. Print the string that
    is between the first and last appearance of "bread"
     in the given string, or return string "nothing" if there are not two pieces of bread.

     input: breadjambread
     output: jam
     */
    String str = "breadbutteryrebread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)  // 5,5

        if(str.contains("bread")){

        int firstBread = str.indexOf("bread");

        if (str.substring(firstBread + 6).contains("bread")) { //jambread

            int secondBread = str.lastIndexOf("bread");
            String result = str.substring(firstBread + 6, secondBread);

            if (result.isEmpty()) {
                System.out.println("nothing");
            } else {
                System.out.println(result);
            }

        } else {
            System.out.println("nothing");
        }

//    } else{
//        System.out.println("nothing");
//
  }
}
}
