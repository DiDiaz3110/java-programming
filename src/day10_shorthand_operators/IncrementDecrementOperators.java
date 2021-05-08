package day10_shorthand_operators;
       /*
        int num = 10;
        num = num + 1;
        num += 1;
        num++;
        ++num;
        //all of thise statements above are adding 1 to the value of num
        */
        public class IncrementDecrementOperators {
            public static void main(String[] args) {
int i = 1;
                System.out.println("i = " + i);
                i++;
                i++;
                ++i;
                ++i;
                System.out.println("i = " + i);

                int linesOfCode = 15;
                System.out.println("linesOfCode = " + linesOfCode);

                //increase linesOfCode by 1, 4 different ways that we learnt today
                linesOfCode = 15;

                linesOfCode = linesOfCode + 1;
                System.out.println("linesOfCode = " + linesOfCode);
                linesOfCode +=1;
                System.out.println("linesOfCode = " + linesOfCode);
                linesOfCode++;
                System.out.println("linesOfCode = " + linesOfCode);
                ++linesOfCode;
                System.out.println("linesOfCode = " + linesOfCode);


                //decrease linesOfCode by 1, 4 different ways that we learnt today
                linesOfCode = linesOfCode -1;
                System.out.println("linesOfCode = " + linesOfCode);
                linesOfCode -=1;
                System.out.println("linesOfCode = " + linesOfCode);
                linesOfCode--;
                System.out.println("linesOfCode = " + linesOfCode);
                --linesOfCode;
                System.out.println("linesOfCode = " + linesOfCode);

                char letter = 'a';
                System.out.println("letter = " + letter);
                letter++;//change to next character in ASCII table
                System.out.println("letter = " + letter);
                letter++;
                System.out.println("letter = " + letter);
                ++letter;
                System.out.println("letter = " + letter);
                letter--;
                System.out.println("letter = " + letter);
                --letter;
                System.out.println("letter = " + letter);
                letter--;letter--;letter--;
                System.out.println("letter = " + letter);
    }
}
