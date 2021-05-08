package HomeworkReplIt;
import java.util.Scanner;
public class ContainWord {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String sentence = scan.nextLine();
            // boolean result;
            // if(sentence.contains("word")){
            //   System.out.println(result);
            // }else{
            //   System.out.println(result);
            // }
           // String result = sentence.contains("word") ? "true" : "false";
           // System.out.println("result = " + result);
                boolean result;
                if(sentence.equals(sentence.contains("word"))){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
            }
        }


