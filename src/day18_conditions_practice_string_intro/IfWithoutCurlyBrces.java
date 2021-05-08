package day18_conditions_practice_string_intro;

public class IfWithoutCurlyBrces {
    public static void main(String[] args) {
        String todaysClass = "python";
        if (todaysClass.equals("java"))
            System.out.println("java is fun");
            //System.out.println("second statement");
        else
            System.out.println("it is not java. It is " + todaysClass);


        //int score == 1;
        //if (score == 1) {
       //     System.out.println("lowest score 1");
        //} else if (score == 1) {
            //System.out.println("lowest score 2");
       // } else if (score == 1) {
       //     System.out.println("lowest score 2");
        }
    }
