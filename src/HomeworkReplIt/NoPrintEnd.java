package HomeworkReplIt;
import java.util.*;
public class NoPrintEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

//        int start = txt.substring(0);
//        int end = txt.indexOf("]");

        int lengthWord = txt.length()-1;
        System.out.println(txt.substring(0, lengthWord));
    }

}
