package day04_Conversation;

public class VariableNamingRules {
    public static void main (String []args){
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int _salary$ = 55;
        // int 1stMonthSalary = 3000; - error, cannot start with numbers
        int $ = 10;
        int _ = 3;
        System.out.println (_);
        //this is will work fine, but not recommended.
        //we should use meaningful variables names
        //int number-of-friends = 400; - error
        int numberOfFriends = 400;
        int number_of_friends = 401;//not convension
        System.out.println (number_of_friends);
    }
}
