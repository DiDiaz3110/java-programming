package day27ForLoop;

public class ReadStringV2 {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";

        for (int i = 0; i < list.length() - 2; i++) {
            System.out.println(list.substring(i, i + 3));

            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")) {
                System.out.println(list.substring(i, i + 3) + " - found");
            }


            // the same but different version

            for (int n = 0; n < list.length() - 2; n++) {
                String part = list.substring(n, n + 3);
                System.out.println("part = " + part);
                if (part.equals("cat") || part.equals("car")) {
                    System.out.println(part + " - found");
                }
            }
        }
    }
}



////