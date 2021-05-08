package day37_methods_overloading;

public class VarArgs {//varargs

    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(25, 45,54,4353,53,424,42);
        addNumbers();

    }

    public static void addNumbers(int... nums){
        //inside the method, it is used as regular array
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);

        }
    }

