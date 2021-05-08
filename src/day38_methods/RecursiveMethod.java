package day38_methods;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);

    }

    public static void printNums(int num) {
        System.out.println(num + " ");
        num++;
        if (num <= 100) {//this how  to stop at certain number
            printNums(num);
        }
    }
}
