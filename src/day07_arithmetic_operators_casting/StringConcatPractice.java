package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main (String []args) {
        System.out.println("java"+5 +3);
        System.out.println("java"+(5 +3));
        System.out.println(5 + 3 +"java");//8java
        System.out.println(5 + (3 +"java"));//53 java

        System.out.println("hello"+ 1+2+3);//hello123
        System.out.println(("hello"+ 1+2+3));//hello123
        System.out.println("hello"+ (1+2+3));//hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+" "+str2);//hello friends
        System.out.println(str1+" "+str1);//hello hello

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);//addition of numbers
        System.out.println(num1+" "+num2);//7 8
        System.out.println(num1+""+num2);//78

        System.out.println(5+5);//10
        System.out.println(5+""+5);//55
        System.out.println(5+" "+5);//5 5

        char char1 = 'a';//97
        char char2 = 'b';//98
        System.out.println(char1+char2);//97+98 = 195
        System.out.println(char1+""+char2);//ab



    }
}
