package OfficeHours.Practice_03_22_2021;
/*
[Qualification For Army]
        Given information: Citizenship(String), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.
        - The person must be a Citizen of the USA or a resident
        -> If not print: You must be a U.S. citizen or a resident
        - Their age must be between 18 and 35
        -> If not print: Your age must be between 18 to 35 years old
        - They must have a high school diploma
        -> If not print: You must have a high school diploma
If all the criteria is met print: You are qualified for the US Army
 */
public class ArmyQualificationNestingBySteps {
    public static void main(String[] args) {
        String citizenship = "USA"; //with step 1
        boolean resident = true;// with step 1
        int age = 18;// with step 3
        boolean hasDiploma = true;// with step 5

        if(citizenship.equalsIgnoreCase("USA") || resident == true){//step 1
//int age = 18;// with step 3 -> you can post them here!
            if(age>= 18 && age <= 35){// step 3
             //   boolean hasDiploma = true;// with step 5   -> you can post them here!
               if(hasDiploma==true){// step 5

                   System.out.println("You are qualified for the US Army");// step 7

               }else{
                   System.out.println("They must have a high school diploma");//// step 6
               }

            }else{
                System.out.println("Their age must be between 18 and 35");  // step 4
            }

        }else{
            System.out.println("You must be a U.S. citizen or a resident");// step 2
        }
    }
}
