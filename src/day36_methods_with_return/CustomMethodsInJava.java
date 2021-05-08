package day36_methods_with_return;

public class CustomMethodsInJava {
    /*
    **CUSTOM METHODS IN JAVA**

- GENERAL RULE: If you have to do something twice, it means you need a reusable method for that
- DRY principle: Do not repeat yourself, avoid duplicate code
- One of the ways to achieve that: Custom methods and functions
- If you want to see how good someone is at coding, look at their custom methods
- In test automation, most of automation related methods are void, void means does not return value

Example:

public static void login(String userName, String password)

{

/// code

}

p

public static void verifyLoginSuccessful(){

[//condition](//condition) to check if login is successful

}

}

- In general java programming, our methods mostly return a value

Example:

String word = "java";

System.out.println(word.charAt(0)); // j

char first = word.charAt(0);

word.contains("v") → returns boolean - true

System.out.println(word.contains("v")); true

boolean b = word.contains("v"); b = true

if(word.contains("v"))...

- Both examples are methods with return value

    charAt(index) → char

    contains()→ boolean

    toUpperCase() → String

    length() → int

    split() → String Array

- So far our custom methods DID NOT return a value
- They only executed certain lines of code

**VOID METHODS:**

1. WITHOUT PARAMETERS

    public static void myMethod() {

    System.out.println("hello from my method");

    }

    Calling void methods:

    myMethod();

    - The above method will print "hello from my method", but it will not return a value when called. It means I CANNOT DO: System.out.println(myMethod()); // ERROR, not return value
    -
2. WITH PARAMETERS

    public static void myMethod(int num) {

    System.out.println("num = " + num);

    }

**NON VOID METHODS/ METHODS WITH RETURN**

1. WITHOUT PARAMETERS
2. WITH PARAMETERS
     */
}
