package day28_Loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;

        for (int day = 0; day <= 30; day++) {

            if (day % 7 == 0) {
                totalCases += 500;
            } else {
                totalCases += 200;
            }
                System.out.println("day+ \" | total cases: \" + totalCases = " + day + " | total cases: " + totalCases);
        }
        System.out.println("JavaCity 11/2011 Total cases: " + totalCases);
    }
}
