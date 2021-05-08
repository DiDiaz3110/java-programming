package day18_conditions_practice_string_intro;

public class NestedIfStatement_Car_lease {
    public static void main(String[] args) {
       /*
        Make = Mercedes;
            Model = E;
            leasePrice = 45;
            Model = A;
            leasePrice  = 45;
        Make = Audi;
            Model = SQ5;
            leasePrice  = 552;
            Model = A3;
            leasePrice  = 412;

        */
        String make = "bmw";
        String model = "E";
        double lease = 0.0;

//           if(make.equals("Mercedes") && model.equals("E")) {
//               lease = 500.0;
//           }else if(make.equals("Mercedes") && model.equals("E")){
//               lease = 400.0;
//               }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                lease = 500.0;
            } else if (model.equals("A")) {
                lease = 400.0;
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("lease = " + lease);
        } else{
            System.out.println("Invalid model");


    }
}
  }
          }

