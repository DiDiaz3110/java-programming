package day26_ForLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        //             int num = 2;
        //          for(int i = 0; i <= 10; i++){
        //          System.out.println(number + " * " + i + " = " + (number * i));
//or like this


        int number = 9;

        if(number < 1 || number > 10){
            System.out.println("ERROR: invalid input");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            int result = 1;
            result = i * number;
            System.out.println(number + "x" + i + " = " + result);
        }
    }
}


