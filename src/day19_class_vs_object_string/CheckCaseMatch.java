package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "usa";

        //"usa"      ==    "USA" -> is country code are equal?
    if(countryCode.equals("USA")){

            System.out.println("Pass - case if correct ");
    }else{
        System.out.println("Fail - case is incorrect");
    }

        /*
        //Как узнать как написаны страны, которые должны быть написаны заглавными буквами.
if(countryCode.equals(countryCode.toUpperCase())){// "USA" Так можно compare the Value of lower case or upper case.
         */
    }
}
