package HomeworkReplIt;
import java.util.Scanner;
public class HW_Case_sensative {
            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter full name:");
            //String userName;
            String userName = scan.nextLine();
            if(userName.equalsIgnoreCase("Max Payne")||userName.equalsIgnoreCase("Alan Wake")){
                System.out.println("User found!");
            }else{
                System.out.println("User not found!");
            }
        }
    }

