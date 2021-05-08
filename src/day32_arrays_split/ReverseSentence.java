package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        //print words array in reverse order
        for(int i = words.length - 1; i >= 0; i--){
            System.out.println(words[i] + " ");
        }
        String sentence2 = "java class is fun";
        System.out.println(sentence2);
        String[] words2 = sentence2.split(" ");
        String reversed = "";

        for(int i = words.length; i >= 0; i--){
            reversed += words2[i] + " ";
        }
            System.out.println(reversed );




    }
}
