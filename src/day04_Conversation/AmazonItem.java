package day04_Conversation;

public class AmazonItem {
    public static void main (String []args){
        String description = "HIC wooden spoon";
        int ratingsCount = 181;
       // int price = 5.99;//not gonna work because its decimal
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;
        //String prime = "yes";

        System.out.println("----PRODUCT INFORMATION-----");
        System.out.println(description);
        System.out.print("*********");
        System.out.println(ratingsCount);
        System.out.println(price);
    }
}
