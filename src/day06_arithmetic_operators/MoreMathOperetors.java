package day06_arithmetic_operators;

public class MoreMathOperetors {
    public static void main (String []args) {
        int toyota = 431;
        int honda = 233;
        int vw = 2;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = (toyota + honda + vw + nissan + bmw);

        System.out.println("There are " + totalCarsInParking + "car in parking lot.");
        int totalCarParking = (toyota+honda+vw+nissan+bmw);
        System.out.println(totalCarsInParking);

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        //there are 2 slices per person

        System.out.println("There are "+slicesPerPerson+" slices per person");

        System.out.println ("We ordered "+pizza+" pizza with "+slices+" slices,"+people +"people "+
                "  ate"+slicesPerPerson+" slices each");

    }
}
