package day18_conditions_practice_string_intro;


public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4576;
        int pinCode = 4758;

        int expLast4SSN = 4444;
        int expPinCode = 333;
        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentification successful");
        }else {
            System.out.println("Authentification unsuccessful");
                if (last4SSN != expLast4SSN) {
                    System.out.println("Last 4 of SSN did not match");
                }
                if(expPinCode != pinCode){
                    System.out.println("Pin code is incorrect");
                }
        }
    }
    }
/*
when expLast4SSN does not match:
    "Last 4 of SSN did not match"
when pinCode does not match:
    "pinCode did not match"
 */