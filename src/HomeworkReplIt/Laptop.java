package HomeworkReplIt;
import java.util.*;
public class Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size: ");
        double screenSize = scan.nextDouble();
        int price = 0;

    if (screenSize == 13.3) {
         price += 200;
    } else if (screenSize == 15.0) {
        price += 300;
    } else if (screenSize == 17.3) {
        price += 400;
    }
    System.out.println("Select CPU type: ");
   // scan.nextLine();
    String CPUType = scan.next();
        if(CPUType.equalsIgnoreCase("i3")) {
        price += 150;
    } else if (CPUType.equalsIgnoreCase("i5")) {
        price += 250;
    } else if (CPUType.equalsIgnoreCase("i7")) {
        price += 350;
    }
    System.out.println("Select RAM size:");
    //scan.nextLine();
    int sizeOfRAM = scan.nextInt();
    if (sizeOfRAM >= 4) {
        price += sizeOfRAM / 4 * 50;
    }
    System.out.println("Select storage type: ");
        String storageType = scan.next();
    System.out.println("Select storage size: ");
        int storageSize = scan.nextInt();
    if(storageType.equalsIgnoreCase("HDD")){
       price += storageSize/500 * 50;
   }else{
       price += storageSize/500 * 100;
   }
        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if(resolution.equals("FULLHD")){
            price += 100;
        }else{
            price +=200;
        }
        System.out.println("Laptop price is: $" + price);
   }
}

