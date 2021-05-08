package day20_StringManipulationMethods;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        //or
        System.out.println(jobTitle.length() == 0);


        if (jobTitle.isEmpty()) {
            System.out.println("Job Title is missing, please resend");
        } else {
            System.out.println("Job Title looks good");
        }





        if (jobTitle.length() == 0) {
            System.out.println("Job Title is empty");
        } else {
            System.out.println("Job Title is not empty");
        }
        System.out.println(jobTitle.equals(""));//true
        System.out.println(jobTitle.equals(" "));//false
        //or
        if ("".equals(jobTitle)) {
        }
        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false
        if(!veggie.isEmpty()){
            System.out.println("We have "+veggie);

        }
    }
}
