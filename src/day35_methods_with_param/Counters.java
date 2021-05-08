package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        // count(7);
        // count(2);
        int num = 9;
        count(num);
      printAge(1981);

        String word = "wooden spoon";
        count(word.length());
        count(word.indexOf("d"));
    }
        public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void printAge(int year) {
            int age = 2021 - year;//calculating the age
            System.out.println("Birth year: " + year + " Age: " + age);

    }
}
