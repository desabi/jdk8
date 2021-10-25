package cinstance;

import java.util.function.BiFunction;

public class UnboundReceiverC {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Abi";


        // uses a lambda expression
        BiFunction<String, String, String> biFunctionA = (stringParam1, stringParam2) -> stringParam1.concat(stringParam2);
        System.out.println(biFunctionA.apply(greeting, name));

        // uses an instance method reference on an unbound receiver
        BiFunction<String, String, String> biFunctionB = String::concat;
        System.out.println(biFunctionB.apply(greeting, name));
    }
}
