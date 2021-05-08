import java.util.Scanner;

public class NeedToDo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();

        String phoneNumber;
        System.out.println("(" + areaCode + ")" + localNumber);
    }}