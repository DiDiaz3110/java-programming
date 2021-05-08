package day30IntroToArray;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
       /*
        id, firstName, lastName, batchNum, phoneNum
        */
        //starts here ->
String[] student1 = new String[5];
        student1[0] = "234";
        student1[1] = "Adam";
        student1[2] = "Diaz";
        student1[3] = "B-21";
        student1[4] = "571-205-8368";

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchNum = " + student1[3]);
        System.out.println("student1 phoneNum = " + student1[4]);

        System.out.println("student data length: " + student1.length);
        //check if student1 data array contains 5 items
        //true: Pass: data array has correct length
        //false: Fail:data array has not correct length

//or this way

        String[] student2 = {"677", "Dinara", "Diaz", "B-22", "7032058368"};

        if(student1.length == student2.length) {
        System.out.println("Pass: data arrays length match");
    } else {
        System.out.println("Fail: data arrays length mismatch");
    }

    if(student1.length==5){
        System.out.println("data array has correct length");
    }else{
        System.out.println("data array has incorrect length");
    }

        System.out.println(student1[1].toUpperCase());
        System.out.println(student1[2].toUpperCase());
        //or
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
        }
    }

