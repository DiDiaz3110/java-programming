package OfficeHours.Practice_03_02_2021;




    /*
    Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
     */
    public class PersonInfo {
public static void main (String []args) {

    //Variables
    String name,fullBirthDate, favoriteQuote;
    byte age;
    char gender;
    boolean student;
    short numberOfSiblings;
    long favoriteNumber;
    int numberOfSeasonsInYourArea, year;
    double birthDate;

    //Assignment of data

name = "Dinara";
age = 39;
gender = 'F';
student = true;
numberOfSiblings = 5;
favoriteNumber = 9L;
numberOfSeasonsInYourArea = 4;
birthDate = 3.2;
year = 2021;
fullBirthDate = "" + birthDate +'.'+ year;//2025.2
favoriteQuote = "Never give up";

System.out.println(fullBirthDate);
System.out.println(birthDate+'.'); //double+char - is not cancatenation, its addition
    System.out.println("Name:"+name);
    System.out.println("Full birthday:" + birthDate+'.');


    //Other printing


}
    }
