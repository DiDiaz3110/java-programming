package HomeworkReplIt;
import java.util.Scanner;
public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        if (word.contains("bread")) {

            int firstBread = word.indexOf(0);

            if (word.substring(firstBread + 6).contains("bread")) {

                int secondBread = word.lastIndexOf("bread");

                System.out.println(word.substring(firstBread+6,secondBread));
            } else {
                System.out.println("nothing");
            }
        } else{
       System.out.println("nothing");


//
//                    if (result.isEmpty()) {
//                    } else {
//                    System.out.println(result);
//                }
//
//                }
//            }

        }
    }
    }

    /*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance
of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 */