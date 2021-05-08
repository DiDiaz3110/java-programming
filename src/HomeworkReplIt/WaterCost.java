package HomeworkReplIt;
import java.util.Scanner;
public class WaterCost {
         public static double waterTax(double units){
            double bill = 0.0;

            //your code here
        double cost =0.0;

        if(units>50){
            bill = units*0.90;
        }else {
            bill =units*0.60;


            if(bill>50) {
                bill += 50;
            }else if (bill>100 && bill<150){
                bill += 100;

            }



        }
            //end your code here

            return bill;
        }//end waterTax

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(waterTax(in.nextDouble()));
        }

    }

