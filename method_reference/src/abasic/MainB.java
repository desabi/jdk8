package abasic;

import java.util.function.Function;

public class MainB {
    public static void main(String[] args) {

        String nameArg = "desabi";

        //Function: converting an object of type T to one of type R (apply)
        //lambda expression
        Function<String, Integer> theFunctionA = nameParam -> nameParam.length();
        MyFunction myFunctionA = nameParam -> nameParam.length();

        //method reference
        Function<String, Integer> theFunctionB = String::length;
        // String.length retorna un int
        // el metodo apply de MyInterface retorna un int
        MyFunction myFunctionB = String::length;

        System.out.println("Length of " + nameArg + " is " + theFunctionA.apply(nameArg));
        System.out.println("Length of " + nameArg + " is " + myFunctionA.apply(nameArg));
        System.out.println("Length of " + nameArg + " is " + theFunctionB.apply(nameArg));
        System.out.println("Length of " + nameArg + " is " + myFunctionB.apply(nameArg));

        // El método que va después de los dos puntos (::length)
        // debe poder procesar los parámetros de entrada
        // que se van a pasar al llamar al método (apply).
    }
}
