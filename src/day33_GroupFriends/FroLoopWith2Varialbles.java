package day33_GroupFriends;

public class FroLoopWith2Varialbles {
    public static void main(String[] args) {
        //Both variables going forward
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        // One is going forward, and another one goes backwards
        for (int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);


        }
    }
}
