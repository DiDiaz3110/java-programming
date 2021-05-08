package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyzeV2 {
    public static void main(String[] args) {
        /*
        Analyze the following without intellij. Calculate the output step by step
*/
    int a = 200;
    int b = -a++ + - --a * a-- % 2 + a;
//       = -200(++) + - (-1)201 * 200  %2  + 199
        //-200(++) + - 200 * 200  %2  + 199
        //-200(++) + - 40000 % 2  + 199
        //-200(++) + 0  + 199            // 40000/2 there is no remainder, thats why is 0
        //-200 + 0  + 199
        //-200 + 199 = -1
//What is the value of a and b?


    }
}
