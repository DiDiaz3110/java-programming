package HomeworkReplIt;
import java.util.Scanner;
public class NoXx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word.toLowerCase().startsWith("x")) {
            System.out.println(word.substring(1));
        } else if (word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);
        }
    }
}



/*
Scanner scan = new Scanner(System.in);
    String word = scan.next();

   if(word.startsWith("X") || word.startsWith("x") && word.endsWith("X") || word.endsWith("x")){
      System.out.println(word.substring(1, word.length()-1));
   }else if(word.startsWith("X") || word.startsWith("x")) {
          System.out.println(word.substring(1));
   }else if  (word.endsWith("X") || word.endsWith("x")) {
           System.out.println(word.substring(0, word.length()-1));

    }else    {
      System.out.println(word);
 */