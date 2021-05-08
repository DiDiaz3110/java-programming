package HomeworkReplIt;
import java.util.*;
public class AlejandroEmail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if(a.contains("dear alejandro.....alot of text")) {
            System.out.print("read");
        } else if (a.contains("thunder blaz is the best drink in the galaxy...")) {
            System.out.print("don't read");
        } else if (a.contains("subject : important project, alejandro we refer to you  this ....")){
            System.out.print("read");
        }
    }
}



