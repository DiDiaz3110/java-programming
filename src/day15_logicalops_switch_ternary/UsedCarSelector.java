package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 10_000.0;
        String model = "Ford";
        double carPrice = 3000;
        if(carPrice <= budget && model.equals("Toyota") || model.equals("Honda") ||model.equals("Tesla")){
            System.out.println("I am buying this model = "+ model+" with price = " + carPrice);
    }else{
            System.out.println("Not interested in model = " + model + " with price = "+carPrice);
        }
}
}
