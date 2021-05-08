package HomeworkReplIt;
import java.util.Scanner;
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = (email.substring(0, email.indexOf("_")));
        System.out.println("First name: " + (firstName.substring(0,1).toUpperCase()
                + firstName.substring(1).toLowerCase()) );
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        System.out.println("Last name: " + (lastName.substring(0,1).toUpperCase()
                + lastName.substring(1).toLowerCase()) );
        String domainName = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println("Domain: " + domainName);
    }
}