package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
//            System.out.println();
//        }
//        String word2 = "java";
//        for (int i = 0; i < word2.length() - 1; i++) {
//            for (int j = 0i + i; j < word.length(); j++) {
//                System.out.print(word2.charAt(j));
//            }
//            System.out.println();
        }
    }
}
