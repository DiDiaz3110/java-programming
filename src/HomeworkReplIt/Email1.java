package HomeworkReplIt;
import java.util.Scanner;
public class Email1 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String email = scan.next();
    String lastNameChanged = email.substring(email.indexOf("_") +1,email.indexOf("@"));
    String firstNameChanged = email.substring(0, email.indexOf("_"));

        if(email.contains("_")){
            System.out.print(lastNameChanged + "_" + firstNameChanged + email.substring(email.indexOf("@")));
        }
        if(!email.contains("_")){
            System.out.print(email);
        }
    }
}
