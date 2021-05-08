package day13_conditional_statement;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if(isHungry == true){// or if(isHungry) { - так как boolean итак определяется true or false
            System.out.println("I am hungry I will go to get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I am not hungry, Lets keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = price<= 100.0;//200 is a budget
        System.out.println("Is this item affordable?"+ isAffordable);

        if(isAffordable) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java!");
        }
        boolean isRemoteJob = true;
        //if it is not remote job, print "Sorry I am not interested"
        //otherwise, print "Sure, I am interested, what is the interview process?"
        if(isRemoteJob!= false){//or if(!is RemoteJob)
            System.out.println("Sorry I am not interested");
            } else {
            System.out.println("Sure, I am interested, what is the interview process?");
        }
        //*****IF STATEMENT WITH STRING*******
        String city = "Los Angeles";
        if(city.equals("Los Angeles")){
            System.out.println("It is LA");
            } else {
            System.out.println("It is not LA");
        }
        String weather = "sunny";
       // if(weather == "sunny"){//it works, not error, but AVOID
         if(weather.equals("sunny")) {
             System.out.println("It is sunny outside");
         } else {
             System.out.println("It is not sunny outside, so let's code java");
         }
    }
}
