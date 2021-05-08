package day28_Loops;

public class BreakVSContinue {
    public static void main(String[] args) {

        // BREAK STATEMENT
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                break;
            }
            System.out.println("n = " + n);//n = 1,n = 2
        }
        // CONTINUE STATEMENT
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.println("i = " + i);//i = 1,i = 3,i = 5
        }
    }
}