package day13_conditional_statement;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***WELCOME TO TD BANK ATM***");

        int secretPincode = 2233;
        int inputPincode = 233;
        if(secretPincode==inputPincode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode!");
            System.out.println("Please try again.");
        }

    }
}
/*
if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."
 */