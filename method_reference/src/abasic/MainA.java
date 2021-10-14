package abasic;

import java.util.function.Function;

public class MainA {
    public static void main(String[] args) {
        String textArg = "Hello World";
        String nameArg = "desabi";

        // Functions: converting an object of type T to one of type R (method apply)

        // lambda expresion
        Function<String, Integer> functionA = textParam -> textParam.length();
        System.out.println("The length of " + textArg + " is: " + functionA.apply(textArg));

        // method reference
        Function<String, Integer> functionB = String::length;
        System.out.println("The length of " + textArg + " is: " + functionB.apply(textArg));

        // lambda expression
        Greet greet1 = nameParam -> nameParam.toUpperCase();
        System.out.println("The name " + nameArg + " toUpperCase is: " + greet1.getMessage(nameArg));
        
        // method reference
        Greet greet2 = String::toUpperCase;
        System.out.println("The name " + nameArg + " toUpperCase is: " + greet2.getMessage(nameArg));
    }
}
