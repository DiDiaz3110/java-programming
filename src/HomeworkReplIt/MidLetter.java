package HomeworkReplIt;
import java.util.*;
public class MidLetter {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            if(word.length()%2 !=0 && word.length() >=3) {
                System.out.print("" + (word.charAt(word.length()/2)));
            }else if(word.length()==1){
                System.out.print(word+ word +word);
            }
            if((word.length()%2) == 0 && word.length() >= 4) {
                System.out.print("" + word.charAt((word.length()/2)-1) + word.charAt(word.length()/2));
            }else if(word.length() == 2){
                System.out.println("" + word.substring(0) + word.substring(0) + word.substring(0));
        }
        }
}

//length(0/2)-1 + length()/2