package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade= 'a';

        if(grade == 'A' || grade == 'B' || grade == 'C'){
            //grade == 'A' || grade == 'a' || grade == 'B' and etc будет работать также
            System.out.println("passed with grade " + grade);
        } else if (grade =='D'){
            System.out.println("Qualify for retake Grade" + grade);
        } else if(grade =='E'){
            System.out.println("Fail. Grade" + grade);
        } else {
            System.out.println("Invallid Grade - " + grade);
        }
    }
}
