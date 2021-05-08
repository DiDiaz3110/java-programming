package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not cosidering - " + city);
        }
            String teacher = "Murodil";
            if(teacher.equals("Saim") || teacher.equals("Muradil")) {
                System.out.println("Looks like it is Java class"+teacher);
            } else if(teacher.equals("Nadir") ) {
                System.out.println("Soft skill class with " + teacher);
            }else {
                System.out.println("Some other class with "+ teacher);
        }
            String company = "NadirTech";
            double salary = 85_000.0;
            if(company.equals("Google") || salary == 100_000){
                System.out.println("I am acceppting that offer ");
            }else{
                System.out.println("Rejecting offer from "+company);
            }
    }
    }

