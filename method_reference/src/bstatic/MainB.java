package bstatic;

import java.util.function.Function;


public class MainB {
    public static void main(String[] args) {
        Integer intArg = 34;

        // static method reference

        // lambda expression
        Function<Integer, String> functionA = intParam -> Integer.toBinaryString(intParam);

        // method reference
        Function<Integer, String> functionB = Integer::toBinaryString;

        System.out.println(intArg + " in binary is: " + functionA.apply(intArg));
        System.out.println(intArg + " in binary is: " + functionB.apply(intArg));
    }
}
