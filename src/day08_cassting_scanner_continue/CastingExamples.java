package day08_cassting_scanner_continue;

public class CastingExamples {
    public static void main(String[] args) {
        //IMPLICIT CASTING
//byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        //float - double
        float num6 = 123.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);
        System.out.println("num9 = " + num9);

        //EXPLICIT CASTING
        //byte - short - int - long
        int num10 = 55;
        //byte num11 = num10;//this line ERROR, int is larger than byte. need to cast it.
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float) num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int) num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);


        //CASTING CHAR TO INT

       // char letter = 'a'; //97
       // int numLetter = letter;
       // System.out.println("numLetter = " + numLetter);

        char letter = 'D';
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numLetter = " + numLetter);

    }
}
