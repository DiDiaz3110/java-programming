package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {

        displayValue(1);// you can put there any value
        displayValue(94);
        int count = 55;
        displayValue(count);//num = count;// displayValue(scan.nextInt());
        // + Scanner scan = new Scanner(System.in);

        greetByName("Saim");
        greetByName("Nadir");

        //or you can assign like this
        String name = "Suleyman";
        greetByName(name);

    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }
    public static void greetByName(String name) {
        System.out.println("Hello " +name + ", how are you today? ");



    }

            //method with parameters/inputs:
    //When you want your methods to be flexible and more
    // reusable, we can add input/parameter variables.
    public static void method1(int n) {
    }
}
