package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        //indexes           0           1       2           3       4           5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("----------FIND THE INDEX OF 'Gloves' in the items aary-----------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
                //System.out.println(i + " - " + items[i]);
            }
        }
        //System.out.println("-----------Set boolean to true if first 'iPad' is found------");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPad Exists" + iPadExists);

        //or like this:
        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean Airpods = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                Airpods = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);

        System.out.println("--------Print a report of each shopping item--------");
        for (int i = 0; i < items.length; i++) {//you can use any of them items.length/price.length or
            //itemIDs.length
            System.out.println(items[i] + " -\t $" + prices[i] + " -\t  #" + itemIDs[i]);
        }
        System.out.println("---------Look for 'Jacket' in items and print all details--------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " \t $" + prices[i] + " \t  #" + itemIDs[i]);
                break;
            }
        }

    }
}

