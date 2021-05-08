package day36_methods_with_return;
/*
method name:
    checkEligible
input/parameter:
    int creditScore

if creditScore is 700 or more
    you are eligible for leasing this car
otherwise
    Sorry, you are not eligible for leasing this car
 */

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(760);

        System.out.println(getCreditScore());
        System.out.println("Credit score: " + getCreditScore());
        //or like this
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
        public static void checkEligible(int creditScore){
            if(creditScore >= 700){
                System.out.println("You are eligible for leasing this car");
            }else{
                System.out.println("sorry, you are not eligible for leasing this car");
            }
        }
    public static int getCreditScore() {
        return 890;
    }
}
