package HomeworkReplIt;
import java.util.Scanner;
public class Printext3Numbers {

            public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter number");
            int num = inp.nextInt();

            next3(num);
        }

        public static void next3(int num){
            System.out.println("\nnext 3 are: ");
            int num1 = num+1;
            int num2 = num+2;
            int num3 = num+3;
            String result = num1 + " " + num2 + " " +num3;
            System.out.println(result);
        }
        // for(int i = num; i <= num+2; i++){
        //   System.out.print(" "+i);

    }

