package day25LoopsInJava;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 0; stars <=15; stars++){
            System.out.print("\uD83C\uDF1F * ");
        }
        System.out.println();//it is in order to have an empty line
        String myStars = "";//myStars are empty, so in line 12 я добавляю value
        // for loop: fill 5 stas to myStars variable.
        for(int i = 1;i <= 5; i ++)
           myStars += " *";
            //or like this: myStars = myStars + "*";
        System.out.println("my stars = " + myStars.trim());
    }
}


