package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        cars -=6;// 6 cars left the parking lot
        //cars = cars-6;
        System.out.println("cars in parking lot = " + cars);
        cars = cars - 1;
        cars -=1;
        System.out.println("cars = " + cars);

        int electricsCars = 13;
        cars = cars + electricsCars;
        System.out.println("Cars in parking lot = " + cars);

        electricsCars = 13;
        cars += electricsCars;
        System.out.println("Cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);

        word += " is fun. ";
        System.out.println("word = " + word);
        word +=12345;
        System.out.println("word = " + word);

String selenium = " but selenium is more fun.";
        System.out.println(word+ selenium);


        char letter = 'A';
        System.out.println("letter = " + letter);
        letter +=3;
        System.out.println("letter = " + letter);
        letter +=1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee = " + parkingFee);
        //early bird fee is 50 off
       // parkingFee= parkingFee/2;
        parkingFee /=2;
        System.out.println("Early bird parkingFee = " + parkingFee);

        //weekend parking is free
        parkingFee -=parkingFee;
        System.out.println("weekend parking fee = "+ parkingFee);


    }

}
