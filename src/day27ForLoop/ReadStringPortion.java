package day27ForLoop;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat, car,cat,red car,java,selenium";

        //using substring , print first 3 letters

        System.out.println(list.substring(0, 3));//
        System.out.println(list.substring(1, 4));
        System.out.println(list.substring(2, 5));
        System.out.println(list.substring(3, 6));
        System.out.println(list.substring(4, 7));
        System.out.println(list.substring(5, 8));
        System.out.println(list.substring(6, 9));
        System.out.println(list.substring(7, 10));

        //****** Now let's do LOOP ********

       // int i = 0;
//        System.out.println(list.substring(i, i + 3));//cat
//        i++;
//        System.out.println(list.substring(i, i + 3));//at,
//        i++;
//        System.out.println(list.substring(i, i + 3));//t,
//        i++;
//        System.out.println(list.substring(i, i + 3));//, c
//        i++;
//        System.out.println(list.substring(i, i + 3));// ca
//        i++;
//        System.out.println(list.substring(i, i + 3));//car
//        i++;
//        System.out.println(list.substring(i, i + 3));//ar,
//        i++;
//        System.out.println(list.substring(i, i + 3));//r,c
//        i++;
//        System.out.println(list.substring(i, i + 3));//,ca
//        i++;


            //****** Now let's do in FOR LOOP ********
        for (int i = 0; i < list.length() - 2; i++) {//-2 it is as many characters we want to print
            System.out.println(list.substring(i, i + 3));


        }
    }
}
