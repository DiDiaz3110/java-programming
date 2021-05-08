package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Arlington";
        double salary = 106_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if(location.equals("Arlington") && salary >= 106_000.0 && isRemote && hasBenefits) {
            System.out.println("Yes, I accept this position");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
