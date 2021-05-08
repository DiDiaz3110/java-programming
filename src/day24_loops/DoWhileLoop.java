package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        do {
            System.out.println("counter = " + counter);
            counter--;// you can do different # hare, e. +=20
        }while (counter <= 10); //true
    }
}
