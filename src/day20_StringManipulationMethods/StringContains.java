package day20_StringManipulationMethods;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));// true
        System.out.println(company.contains("ital"));// true
        System.out.println(company.contains("l o"));// true
        System.out.println(company.contains("j"));// false
        System.out.println(company.contains("One"));// false

        //if company contains space, print "multiple words company name"
        //else "single word company name
        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }
String etsyTitle = "Wooden spoon | Etsy";
        //check if "|" is in etsyTitle
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }
        String firstName = "ahmed";
        if(firstName.contains("e") && firstName.contains("a")){
            System.out.println("both a&e are present");
        }else{
            System.out.println("a || e are not present");
        }
        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or I is present");
        }else{
            System.out.println("nor a or i is present");
        }
        String email = "myzhanym@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Nice email");
        }else{
            System.out.println("Not good email");
        }
        //        CHANING
        //******** Чтобы найти  свой email, который ты написал, но не помнишь с заглавной или маленькой буквы ********
if(email.toLowerCase().contains("d")){
    System.out.println("d is present");
}else{
    System.out.println("d is not present");
}
    }
}
