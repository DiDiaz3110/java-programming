package OfficeHours.Practice_03_23_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = "";//java -4, apples - 6

        if (wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne;
        }
        if (wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }
        System.out.println("Longest word with A: " + biggestWordWithA);

            if(biggestWordWithA.isEmpty()) {
        System.out.println("No words contained A");
             } else {
        System.out.println("Longest word with A: " + biggestWordWithA);
    }
    }
}