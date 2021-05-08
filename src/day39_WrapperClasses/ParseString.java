package day39_WrapperClasses;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(total);
        System.out.println(count);
        int num = Integer.parseInt("55");
        System.out.println(num);


        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println(price);
        if(price > 100){
            System.out.println("Expenssive");
        }
String sentence = "I wrote 100 lines of code";
        //Split by space, parse index 2 to int
        String[] words  = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}

