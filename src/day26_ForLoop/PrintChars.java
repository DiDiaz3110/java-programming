package day26_ForLoop;

public class PrintChars {
    public static void main(String[] args) {

        //********long way, without loop*****
//        String word = "java";
//        System.out.println(word.length());
//        System.out.println(word.charAt(0));
//        System.out.println(word.charAt(1));
//        System.out.println(word.charAt(2));
//        System.out.println(word.charAt(3));
//        System.out.println(word.charAt(4));//ERROR

//*************USE the LOOP****************
//        String word = "java";
//        for (int i = 0; i < word.length(); i++) {
//            System.out.println(i + " " + word.charAt(i));
            // not i<= потому
//  что длина больше на одну цифру и машина будет давать постоянную ошибку

            //*******REVERSE*******
        String word = "Dinara";
            for (int d = word.length() - 1; d >= 0; d--) {
                System.out.println(d + " - " + word.charAt(d));
            }
        }
    }
//}