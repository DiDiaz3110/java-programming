package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count >= 0) {
            System.out.println("count - " + count);//5, 4, 3,2, 1
            count--;
            Thread.sleep(500);
        }
        int unreadSMS = 10;
        while (unreadSMS > 0) {
            System.out.println("Read each message one by one- " + unreadSMS);
            unreadSMS--;
            Thread.sleep(500);
        }
        System.out.println("No more messages");
    }
}
