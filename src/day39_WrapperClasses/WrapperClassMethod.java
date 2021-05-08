package day39_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.min(5,2));
        System.out.println(Integer.sum(5,2));
        System.out.println(Integer.max(5,562));
        System.out.println(Integer.min(5,2));
        System.out.println("min int = " + Integer.MIN_VALUE);
        System.out.println("max int = " + Integer.MAX_VALUE);


        System.out.println(Double.max(234.4, 34.8));
        System.out.println(Double.min(234.4, 34.8));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));//1
        System.out.println(Double.compare(5,5));//0
        System.out.println(Double.compare(5,45));//-1

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('8'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
String word = "JaVa iS FuN";
        for(int i = 0; i< word.length()-1; i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));

                System.out.print(Character.MIN_VALUE);
                System.out.print(Character.MAX_VALUE);

                String total = "345";
                int count = Integer.parseInt(total);
                int num = Integer.parseInt("55");

                String strPrice = "123.99";
                double price = Double.parseDouble(strPrice);




            }
        }

    }
}
