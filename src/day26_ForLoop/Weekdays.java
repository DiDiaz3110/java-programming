package day26_ForLoop;

public class Weekdays {
    public static void main(String[] args) {
//            int n = 1;
//            switch(n) {
//                case 1:
//                    System.out.println(n + "- Monday");
//                    break;
//                case 2:
//                    System.out.println(n + "- Tuesday");
//                    break;
//                case 3:
//                    System.out.println(n + "- Wednesday");
//                    break;
//                case 4:
//                    System.out.println(n + "- Thurday");
//                    break;
//                case 5:
//                    System.out.println(n + "- Friday");
//                    break;
//                case 6:
//                    System.out.println(n + "- Saturday");
//                    break;
//                case 7:
//                    System.out.println(n + "- Sunday");
//                    break;
//                default:
//                    System.out.println(n + "no such a day, it's java day");
//            }
        //    *******DO IT IN LOOP********
         for (int day = 1; day <= 10; day++) {
             switch(day){
              case 1:
                  System.out.println(day + "- Monday");
                  break;
              case 2:
                  System.out.println(day + "- Tuesday");
                  break;
              case 3:
                  System.out.println(day + "- Wednesday");
                  break;
              case 4:
                  System.out.println(day + "- Thurday");
                  break;
              case 5:
                  System.out.println(day + "- Friday");
                  break;
              case 6:
                  System.out.println(day + "- Saturday");
                  break;
              case 7:
                  System.out.println(day + "- Sunday");
                  break;
              default:
                  System.out.println(day + "no such a day, it's java day");
          }
        }
    }
}
