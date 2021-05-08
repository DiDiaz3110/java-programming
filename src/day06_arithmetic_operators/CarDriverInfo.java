package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String []args){
       String carModel = "Tesla";
       String driverName = "Michael Diaz";
       String licenseNum = "DD08012020";
       short speed =75;
       boolean isAthomatic = true;
       char licenseClass = 'D';

       System.out.println("Model of the Vehical: \t"+carModel);
       System.out.println(carModel+" is car model.");
       System.out.println("Name: \t\t\t\t\t"+driverName);
       System.out.println(driverName+" is driving that car!");
       System.out.println("License Number: \t\t"+licenseNum);
       System.out.println(driverName+" is driving "+carModel);
       System.out.println("Current speed is: \t\t"+speed+" mph");
       System.out.println("Is the car Authomatic?  "+isAthomatic);
       System.out.println(licenseClass+" +isAthomatic");
       System.out.println("Class of License: \t\t"+licenseClass);



    }
}
