package day17_ternaty_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        //dataType variableName = (boolean expression) ? trueValue : falseValue;

        //String result = (score > 560) ? "pass" : "fail";
       // int x = (quality.equals ("good")) ? 100 : 0;
       // char grade = (score>90) ? 'A' : 'B';
       // String evenOdd = (score%2==0) ? "even" : "odd";
        int score1 = 75;
        String result1;
        if(score1> 60){
            result1 = "Pass";
        }else{
            result1 = "Fail";
        }
        System.out.println("result1 = " + result1);

        //WITH TERNARY
        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
      //  if(score > 90){
      //      grade = 'A';
      //  }else{
      //      grade = 'B';
      //  }



    }
}
