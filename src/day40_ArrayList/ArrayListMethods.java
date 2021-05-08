package day40_ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("Lisr is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("wooden spoon");
        if (shoppingList.isEmpty()) {
            System.out.println("Lisr is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");

            int count = shoppingList.size();
            System.out.println(shoppingList.size());

            System.out.println("is shoes is in my list? " + shoppingList.contains("shoes"));
            if(shoppingList.contains("shoes")){
                System.out.println("Yes we ave shoes");
            }else{
                System.out.println("There no shoes!");
            }
            System.out.println("Buying shoes....$80");
            shoppingList.remove("shoes");
            System.out.println(shoppingList);//removed

            System.out.println("Done shopping, get back to coding");
            shoppingList.clear();// clear thelist, remove all items
            System.out.println(shoppingList);

        }
    }
}

