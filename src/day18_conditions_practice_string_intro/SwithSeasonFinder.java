package day18_conditions_practice_string_intro;

public class SwithSeasonFinder {
    public static void main(String[] args) {
//        int winter = 12, 1, 2;
//        int spring = 3, 4, 5;
//        int summer = 6, 7, 8;
//        int fall = 9, 10, 11;

        int month = 10;
//        if(month == 12 || month == 1 ||month == 2 ){
//            System.out.println("Winter");
        //  }else if(
        switch (month) {
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month - ");
        }

        //OR YOU CAN DO LIKE THIS
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month - ");
        }
    }
}
