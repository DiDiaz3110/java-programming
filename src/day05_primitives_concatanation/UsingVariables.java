package day05_primitives_concatanation;

public class UsingVariables {
    public static void main (String []args){
        int num1 = 100;//100
        int num2 = num1;//100
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);//200
        System.out.println(num2);//100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;

        /*
        n1 - 55
        n2 - 55
        n3 - 55
         */
        System.out.println (n1);
        System.out.println (n2);
        System.out.println (n3);

        int inthirasZipCode = 22182;
        int intparvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(intparvinsZipCode);

        inthirasZipCode = 20007;
        intparvinsZipCode = 29998;
        System.out.println(inthirasZipCode);
        System.out.println(intparvinsZipCode);





    }
}
