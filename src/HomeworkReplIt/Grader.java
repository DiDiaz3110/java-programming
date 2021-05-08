package HomeworkReplIt;
import java.util.Scanner;
public class Grader {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grader!");
        String subject1 = "Math";
        double grade1 = 5.0;
        String subject2 = "Biology";
        double grade2 = 4.2;
        String subject3 = "English";
        double grade3 = 4.4;
        String subject4 = "Chemistry";
        double grade4 = 4.8;
        String subject5 = "Music";
        double grade5 = 3.4;
        double averageScore = ((grade1 + grade2 + grade3 + grade4 + grade5)/5);

        System.out.println("Summary: " + subject1 + " - " + grade1 + "," + subject2 + " - " + grade2 + "," +subject3 + " - " + grade3 + "," + subject4 + " - " + grade4 + "," + subject5 + " - " + grade5);
        System.out.println("Your average score is: " + averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}

