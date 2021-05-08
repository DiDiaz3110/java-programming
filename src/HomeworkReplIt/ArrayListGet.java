package HomeworkReplIt;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListGet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }


        // Write your code below
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}





