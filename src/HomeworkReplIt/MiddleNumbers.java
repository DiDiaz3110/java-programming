package HomeworkReplIt;
import java.util.*;
public class MiddleNumbers {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //String half = "" + word.charAt(word.length()/2) + word.charAt(word.length()/2+1)
                //    + word.charAt(word.length()/2-1);
            if(word.length() %2!=0 && word.length()>5){
                System.out.println("" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2)
                        + word.charAt(word.length()/2+1));
            }else{
                System.out.println("invalid");
            }
        }
}
