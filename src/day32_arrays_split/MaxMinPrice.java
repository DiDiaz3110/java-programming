package day32_arrays_split;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {
        //indexes           0           1       2           3       4           5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        //Print Arrays values asa String
        System.out.println(Arrays.toString(items));//if it's not working push Alt+Enter
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("-----1) find and print details of most expensive item------ ");
        double maxPrice = prices[0];//assume first price is max
        int indexOfMaxPrice = 0; //assume max price is at index 0
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);
    }
}

//
//   double minPrice = prices[0];
//        for (int j = 0; j < prices.length; j++) {
//        if (prices[j] < miniumum) {
//            miniumum = prices[j];
//            System.out.println("Cheapest item - " + items[j] + " - $" + prices[j] + " - ID #" + itemIDs[j]);
//            break;
//



