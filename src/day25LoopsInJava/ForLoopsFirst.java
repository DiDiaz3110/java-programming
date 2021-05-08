package day25LoopsInJava;

public class ForLoopsFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop with For loop like: while(true) {   }
         for(;;){
         System.out.println("Java is fun!");
         }
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world");
        }
        //Flow by step:
        //   (1)          (2)     (4)
        for (int i = 0; i <= 10; i++) {// or for (int i = 1; i < 11; i++) {
            System.out.println(i);//(3)
        }

    }
    }
