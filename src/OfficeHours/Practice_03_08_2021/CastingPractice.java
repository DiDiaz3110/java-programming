package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        //byte-> short-> int-> long -> float -> double

        /*
        by default whole numbers will be read as int data type
        by default decimal numbers will be read as double data type
         */
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;//int = [(short) double] -> INT = Short
        int i2 = (int)d;
        System.out.println("d = " + d);//5
        System.out.println((double)d);//5.0
//FLOAT is DOUBLE
        float f = 3.54f;
        float f2 = (float)3.54f;//Folat = double
        System.out.println("f2 = " + f2);

//LONG is INT but big
        long l = 22313; //long = int //is no problem
        long l2= 234235345224L;
        //long l3= (long)234235345224L;// this one doesnt work because the num is too big for int, next get to cast
        System.out.println("l = " + l);
        System.out.println((double)l);
        System.out.println((float)l);
        System.out.println("l2 = " + l2);


        float f3 = 5;//complaire think 5 is int, so it can fit with no problem
        float f4 = 5.5f;//if you put f by the end - complier will think that it float
        System.out.println("f4 = " + f4);
double million = 1_000_000;//_ ставится для того чтобы легче воспринимать информацию
        System.out.println("million = " + million);
    }
}
