package cinstance;

import java.util.function.Function;

public class UnboundReceiverB {
    public static void main(String[] args) {
        String stringArg = "DESABI";

        // Functions: converting an object of type T to one of type R (method apply)
        // receiver: you can provide it implicitly when the method is invoked
        // ClassName::instanceMethod
        Function<String, Integer> functionA = stringParam -> stringParam.length();
        // stringArg is the receiver of String::length
        Function<String, Integer> functionB = String::length;

        System.out.println(functionA.apply(stringArg));
        System.out.println(functionB.apply(stringArg));
    }
}
