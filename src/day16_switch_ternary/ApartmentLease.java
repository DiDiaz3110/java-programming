package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("Welcome to Sanctrum apartments");
        int numberOfBedrooms = 20;
        double startingPrice = 0;

        switch(numberOfBedrooms){
            case 0:
                startingPrice = 1454.0;
                System.out.println("Studio appartment selected");
                break;
            case 1:
                startingPrice = 1725.0;
                System.out.println("One bedroom apartment selected");
                break;
            case 2:
                startingPrice = 2899.0;
                System.out.println("Two bedroom apartment selected");
                break;
            default:
                System.out.println(" bedroom currently unavailable");
                return;
        }
        System.out.println("Starting price: $" + startingPrice);
    }
}
