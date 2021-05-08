package day25LoopsInJava;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if(start>end){
            System.out.println("reverse numbering is not supported");
        }

        for(int i = start; i<= end; i++){
        System.out.print(i + " ");
        }

//        for (int i = start; i <= end; i++) {
//            if (i % 3==0 && i % 5==0) {
//                System.out.println("FizzBuzz");
//            } else if (i%3==0) {
//                System.out.println("Fizz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);

        }
    }

