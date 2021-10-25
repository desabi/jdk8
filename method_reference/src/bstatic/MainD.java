package bstatic;

import java.util.function.Function;


public class MainD {
    public static void main(String[] args) {
        Integer intArg = 34;

        // static method reference

        // lambda expression
        Function<Integer, String> functionA = intParam -> Integer.toBinaryString(intParam);

        // method reference
        Function<Integer, String> functionB = Integer::toBinaryString;

        System.out.println(intArg + " in binary is: " + functionA.apply(intArg));
        System.out.println(intArg + " in binary is: " + functionB.apply(intArg));

        // El método que va después de los dos puntos (::toBinaryString)
        // debe poder procesar los parámetros de entrada
        // que se van a pasar al llamar al método (apply).
    }
}
