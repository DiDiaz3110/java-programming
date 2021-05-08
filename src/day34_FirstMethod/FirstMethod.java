package day34_FirstMethod;

public class FirstMethod {
    public static void main(String[] args) {

    displayMessage();// call the method
        displayMessage();// call the method
        displayMessage();// call the method

       for(int i = 0; i< 100; i++){
           System.out.println(i + 1 + " -");
           displayMessage();// call the method
       }
            }
    //first custom reusable method
    public static void displayMessage() {//this can be placed anywhere
        System.out.println("Hello B22 Friends!");
    }
}
