public class MistakesOnQuiz {
   //Quiz #1 Variables
    public static void main(String[] args) {
        System.out.println("Result A"+0 +1);
        System.out.println("Result B" +(1)+(2));

        System.out.println("5 + 2 =" + 3 + 4);
        System.out.println("5 + 2 =" + (3 + 4));

        float a = 100.987_6543f;
        short b = (byte) a;
        byte c = (byte) b;
        System.out.println("c = " + c);

    }
}
