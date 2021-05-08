package HomeworkReplIt;
import java.util.Scanner;
public class toBeOrNotToBe {
           public static boolean hamletQuote(boolean toBe,boolean notToBe) {
           boolean result;
               if (toBe == false && notToBe == false){
                   result = false;
             }else{
            result = true;
             }
            return result;




        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
        }
    }

