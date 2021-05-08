package day40_ArrayList;
import java.util.*;
public class RawArrayLiast {
    public static void main(String[] args) {

        //Declare RAW arrayList
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();// the same as ArrayList list1 = new ArrayList(); just more popular

        //Add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println(list1.size());

        //RESTRICTED ArrayList
        ArrayList<Integer> nums = new ArrayList<>();


    }

}
