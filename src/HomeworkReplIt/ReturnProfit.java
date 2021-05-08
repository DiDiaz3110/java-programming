package HomeworkReplIt;
import java.util.*;

class Main {

    public static String profits(int buyPrice,int sellPrice){
        String result = "";
        if (buyPrice == sellPrice){
            result = "no loss";
        }else if(buyPrice>sellPrice){
            result = "loss";
        }else {
            result  = "profit";
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }

}